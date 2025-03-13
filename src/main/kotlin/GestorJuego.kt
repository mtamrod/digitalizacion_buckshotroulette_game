package org.practicatrim2
/**
 * Gestor del juego BuckShot Roulette que maneja la lógica de las rondas, los turnos de los jugadores
 * y la interacción con los objetos del juego.
 *
 * Esta clase es responsable de iniciar y gestionar cada ronda del juego, incluyendo la generación
 * de balas, objetos y el control de los turnos de los jugadores (Jugador y Dealer). También se encarga
 * de mostrar los resultados del juego al final.
 *
 * @param jugador El jugador humano que participa en la partida.
 * @param maquina El Dealer, jugador controlado por la IA que enfrenta al jugador humano.
 */
class GestorJuego(private val jugador: Jugador, private val maquina: Jugador) {

    /**
     * Inicia la partida y gestiona el ciclo de rondas mientras ambos jugadores tengan vida.
     * El juego continúa hasta que uno de los jugadores pierda toda su vida.
     */
    fun inicio() {
        limpiarConsola()
        println("Iniciando partida...")
        limpiarConsola()

        var nRonda = 0
        while (jugador.vida > 0 && maquina.vida > 0) {
            nRonda += 1
            rondas(nRonda)
        }

        println("Juego terminado. ${if (jugador.vida > 0) "${jugador.nombre} ha ganado!" else "El Dealer ha ganado!"}")
    }

    /**
     * Realiza una ronda del juego, generando balas y objetos aleatorios y manejando los turnos
     * de los jugadores hasta que se agoten las balas o un jugador pierda toda su vida.
     *
     * @param nRonda El número de la ronda que se está jugando.
     */
    private fun rondas(nRonda: Int) {
        limpiarConsola()
        println("\n--- RONDA $nRonda---")

        val balas = generarBalas()
        val objetos = generarObjetos(balas)

        // Contamos la cantidad de cada tipo de bala
        val balasFalsas = balas.count { it is BalaFalsa }
        val balasReales = balas.count { it is BalaReal }

        println("Se han cargado ${balas.size} balas en la escopeta.")
        println("Balas reales: $balasReales | Balas falsas: $balasFalsas")
        esperarJugador()

        comprobarPartida(balas, objetos)

        println("\nLa ronda ha terminado. Se han agotado las balas.\n")
        esperarJugador()
    }

    /**
     * Genera una lista aleatoria de balas que pueden ser reales o falsas.
     *
     * @return Una lista de balas aleatorias.
     */
    private fun generarBalas(): MutableList<Bala> {
        // Generamos una lista de balas aleatorias (1 a 6 balas)
        val balas = List((3..6).random()) {
            if ((0..1).random() == 0) BalaFalsa() else BalaReal()
        }.toMutableList()

        return balas
    }

    /**
     * Genera una lista aleatoria de objetos que pueden ser utilizados por los jugadores durante la partida.
     *
     * @param balas La lista de balas para la ronda actual. Se usa para algunos objetos como la "Lupa".
     * @return Una lista de objetos aleatorios que los jugadores pueden usar.
     */
    private fun generarObjetos(balas: MutableList<Bala>): MutableList<Items<Jugador>> {
        // Generamos una lista de objetos aleatorios (1 a 3 objetos)
        val objetos = List((0..3).random()) {
            when ((1..3).random()) { // Genera un número aleatorio entre 1 y 3
                1 -> Items<Jugador>(
                    nombre = "Cigarrillo",
                    descripcion = "Cura 1 vida",
                    habilidad = { jugador -> jugador.curar(1)
                    }
                )

                2 -> Items<Jugador>(
                    nombre = "Lupa",
                    descripcion = "Permite ver la bala de la recámara actual",
                    habilidad = {
                        if (balas.isNotEmpty()) {
                            val balaActual = balas.first()
                            val tipo = if (balaActual is BalaReal) "Real" else "Falsa"
                            println("La bala actual es: $tipo")
                        }
                    }
                )

                3 -> Items<Jugador>(
                    nombre = "Cerveza",
                    descripcion = "Permite descartar la bala actual de la recámara",
                    habilidad = {
                        if (balas.isNotEmpty()) {
                            val balaActual = balas.first()
                            balas.removeAt(0)
                            val tipo = if (balaActual is BalaReal) "Real" else "Falsa"
                            println("Se descarta una bala $tipo")
                        }
                    }
                )
                else -> null
            }
        }.filterNotNull().toMutableList()

        return objetos
    }

    /**
     * Comprueba si la partida sigue en curso, gestionando los turnos de los jugadores (humano y Dealer).
     * Este método controla el flujo de la partida, asegurándose de que los jugadores sigan tomando turnos
     * hasta que uno de ellos pierda toda su vida o las balas se agoten.
     *
     * @param balas La lista de balas disponibles en la partida.
     * @param objetos Los objetos que los jugadores pueden utilizar durante su turno.
     *
     * Este método alterna los turnos entre el jugador humano y el Dealer:
     * - El jugador realiza su turno, eligiendo si usar un objeto o disparar.
     * - Luego, si el Dealer sigue con vida, toma su turno y dispara.
     *
     * El ciclo continúa hasta que uno de los jugadores pierda toda su vida o se agoten las balas.
     */
    private fun comprobarPartida(balas: MutableList<Bala>, objetos: MutableList<Items<Jugador>>) {
        while (balas.isNotEmpty() && jugador.vida > 0 && maquina.vida > 0) {
            turnoJugador(balas, objetos)
            if (maquina.vida <= 0) break

            turnoMaquina(balas, objetos)
        }
    }

    /**
     * Gestiona el turno del jugador humano, donde puede elegir usar un objeto o disparar.
     *
     * @param balas La lista de balas disponibles en la ronda.
     * @param objetos Los objetos que el jugador tiene disponibles para usar.
     */
    private fun turnoJugador(balas: MutableList<Bala>, objetos: MutableList<Items<Jugador>>) {
        if (balas.isEmpty()) return

        println("\nTurno de ${jugador.nombre}...")
        println("¿Qué quieres hacer primero? (1 = Usar Objeto, 2 = Disparar")
        val orden = readlnOrNull()?.toIntOrNull()
        if (orden == 1) {
            //Usar Objeto
            if (objetos.isNotEmpty()) {
                println("Objetos:")
                objetos.forEachIndexed { index, objeto -> println("${index + 1}. ${objeto.nombre}: ${objeto.descripcion}")  }
            } else {
                println("No tienes objetos")
            }
            if (objetos.isNotEmpty()) {
                print("Elige el objeto a usar: ")
                val opcionItem = readlnOrNull()?.toIntOrNull()
                if (opcionItem != null && opcionItem in 1..objetos.size) {
                    val objetoSeleccionado = objetos[opcionItem - 1]
                    objetoSeleccionado.habilidad(jugador)
                    println("${jugador.nombre} ha usado ${objetoSeleccionado.nombre}")
                    objetos.removeAt(opcionItem - 1) //Eliminar objeto tras usarlo
                }
            }
        }
        //Disparar
        print("¿A quién quieres disparar? (1 = a ti mismo, 2 = al Dealer): ")
        val eleccion = readlnOrNull()?.toIntOrNull()

        val objetivo = when (eleccion) {
            1 -> jugador // Si el jugador se dispara a sí mismo
            2 -> maquina  // Si el jugador dispara al dealer
            else -> {
                println("Opción inválida, dispararás al Dealer por defecto.")
                maquina
            }
        }

        val bala = balas.removeFirst()
        println("Disparando...")
        limpiarConsola()

        // El disparo afecta al objetivo
        bala.disparar(objetivo)
        println("Vida de ${objetivo.nombre}: ${objetivo.vida}")

        // Si el jugador se dispara a sí mismo y la bala es falsa, repite turno
        if (objetivo == jugador && bala is BalaFalsa) {
            println("La bala era falsa, ${jugador.nombre} tiene otro turno.")
            turnoJugador(balas, objetos) // Repite el turno solo si el jugador se dispara a sí mismo
        }
        esperarJugador()
    }

    /**
     * Gestiona el turno del Dealer (IA), quien puede usar objetos y disparar al jugador o a sí mismo.
     *
     * @param balas La lista de balas disponibles en la ronda.
     * @param objetosDealer Los objetos que el dealer tiene disponibles para usar.
     */
    private fun turnoMaquina(balas: MutableList<Bala>, objetosDealer: MutableList<Items<Jugador>>) {
        if (balas.isEmpty()) return

        println("\nTurno del Dealer...")

        // Objetos Dealer
        if (objetosDealer.isNotEmpty()) {
            val usarObjeto = (1..2).random() == 1 // 50% de probabilidades de usar un objeto
            if (usarObjeto) {
                val objetoSeleccionado = objetosDealer.random()
                objetoSeleccionado.habilidad(maquina)
                println("El Dealer ha usado ${objetoSeleccionado.nombre}")

                // Eliminar objeto después de usarlo
                objetosDealer.remove(objetoSeleccionado)
            }
        }

        // Disparos Dealer
        val objetivo: Jugador = if ((1..2).random() == 1) jugador else maquina // 50% de disparar al jugador o el mismo
        val balaActual = balas.removeAt(0)

        println("El Dealer dispara a ${objetivo.nombre}...")
        balaActual.disparar(objetivo)
    }
}
