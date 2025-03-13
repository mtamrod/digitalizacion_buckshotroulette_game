package org.practicatrim2

/**
 * Representa un proyectil, que puede dispararse a un jugador, causando o no daño.
 *
 * Esta interfaz define las propiedades comunes de cualquier tipo de bala, como el daño y el mensaje de disparo.
 * Las clases que implementen esta interfaz deben proporcionar una implementación específica para los valores de
 * `danio` y `msj_disparo`, dependiendo de si la bala es real o falsa.
 *
 * @property danio El daño que causa la bala al jugador al ser disparada. Puede ser 0 o mayor, dependiendo de la clase.
 * @property msj_disparo El mensaje que se muestra al disparar la bala.
 */
interface Bala {
    val danio: Int //Posible futura implementación de configuración y json
    val msj_disparo: String

    /**
     * Dispara al jugador objetivo, reduciendo su vida según el daño del proyectil.
     *
     * @param jugador El jugador que recibe el disparo.
     *
     * - Resta `danio` a la vida del jugador.
     * - Muestra el mensaje asociado al disparo (`msj_disparo`).
     */
    fun disparar(jugador: Jugador) {
        jugador.vida -= danio
        println(msj_disparo)
    }
}

/**
 * Representa una bala real, que causa daño cuando se dispara.
 *
 * Esta clase extiende de la clase `Bala` y define un daño de 1 unidad.
 * Al disparar una bala real, se imprime el mensaje "¡¡¡PUM!!!, el arma se ha disparado".
 *
 * @param danio El daño que inflige la bala real. Por defecto es 1.
 */
class BalaReal(override val danio: Int = 1) : Bala{
    override val msj_disparo = "¡¡¡PUM!!!, el arma se ha disparado"
}

/**
 * Representa una bala falsa, que no causa daño cuando se dispara.
 *
 * Esta clase extiende de la clase `Bala` y define un daño de 0, lo que significa que no afecta al jugador.
 * Al disparar una bala falsa, se imprime el mensaje "Click... no se ha disparado el arma".
 */
class BalaFalsa() : Bala{
    override val danio = 0
    override val msj_disparo = "Click... no se ha disparado el arma"
}