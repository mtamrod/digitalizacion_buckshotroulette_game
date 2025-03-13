package org.practicatrim2
/**
 * Función principal que inicia el juego BuckShot Roulette.
 *
 * El juego comienza mostrando un menú con opciones para:
 * 1. Jugar: Inicia una partida solicitando el nombre del jugador y creando una nueva instancia del juego.
 * 2. Reglas: Muestra las reglas del juego.
 * 3. Soporte y Ayuda: Proporciona la información de contacto para soporte.
 * 4. Salir: Termina la ejecución del programa.
 *
 * Dependiendo de la opción seleccionada por el usuario, se realiza la acción correspondiente:
 * - Si se elige "Jugar", se pide el nombre del jugador, se crean dos instancias de `Jugador` y se inicia el juego.
 * - Si se elige "Reglas", se muestran las reglas básicas del juego.
 * - Si se elige "Soporte y Ayuda", se muestra el correo de contacto para soporte.
 * - Si se elige "Salir", se termina el programa.
 *
 * @see Jugador
 * @see GestorJuego
 */
fun main() {

    //Menu principal
    println("¡¡¡Bienvenido a BuckShot Roulette By Mario Tamayo!!!")
    println("----\nMENU\n----")
    println("1. Jugar")
    println("2. Reglas")
    println("3. Soporte y Ayuda")
    println("4. Salir")

    println("\n-> ")
    val opcion = readln().toInt()
    limpiarConsola()
    when(opcion) {
        1 -> {
            println("\nIngresa tu nombre: ")
            val nombreJugador = readln()
            val jugador1 = Jugador(nombreJugador)
            val maquina = Jugador("Dealer")

            val juego = GestorJuego(jugador1, maquina)
            juego.inicio()
        }
            2 -> {
                limpiarConsola()
                println("-----------------\nReglas del Juego:\n-----------------")
                println("BuckShot Roulette es un simple juego que involucra a 2 jugadores: \"Jugador\" y \"Dealer\". Se cargan aleatoriamente balas reales y falsas en un arma y los jugadores toman turnos disparándose el uno al otro hasta que alguno pierda todas sus vidas. Si la bala es falsa, el jugador puede disparar de nuevo, pero si es real, pierde.")
                println("Los jugadores disponen de objetos en la partida que les ofrecerán ventajas en la partida")
            }
        3 -> println("Contacta conmigo en: mtamrod534@g.educaand.es")
        4 -> println("Saliendo...")
        else -> println("Opción inválida")
    }
}

/**
 * Limpia la consola simulando una pausa antes de continuar con el juego.
 *
 * - Espera 2 segundos antes de limpiar la pantalla.
 * - Imprime 50 líneas en blanco para simular la limpieza de la consola.
 */
fun limpiarConsola() {
    Thread.sleep(2000)
    repeat(50) { println() }
}

/**
 * Pausa la ejecución del programa hasta que el jugador presione "Enter".
 *
 * - Muestra un mensaje indicando que el jugador debe presionar Enter para continuar.
 * - Espera la entrada del usuario antes de proseguir con la ejecución.
 */
fun esperarJugador() {
    println("Presiona Enter para continuar...")
    readln()
}


