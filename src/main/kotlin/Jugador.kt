package org.practicatrim2

/**
 * Representa a un jugador en el juego, con un nombre y una cantidad de vida.
 * Esta clase maneja las operaciones básicas que afectan al estado de un jugador, como la curación de vida.
 *
 * @property nombre El nombre del jugador.
 * @property vida La cantidad de vida del jugador, que puede ser incrementada o decrementada durante el juego.
 *
 * @constructor Crea un jugador con los valores proporcionados o usa valores predeterminados.
 * @param nombre El nombre del jugador. Si no se proporciona, se asigna "Jugador" por defecto.
 * @param vida La cantidad de vida inicial del jugador. Si no se proporciona, se asigna 5 por defecto.
 */
class Jugador(var nombre: String, var vida: Int) {

    constructor(vida: Int) : this("Jugador", vida)
    constructor(nombre: String) : this(nombre, 5)
    constructor() : this("Jugador", 5)

    /**
     * Cura al jugador aumentando su cantidad de vida.
     *
     * Esta función aumenta la vida del jugador en la cantidad especificada por el parámetro `cantidad`.
     * La vida no puede ser negativa.
     *
     * @param cantidad La cantidad de vida a agregar al jugador. No debe ser negativa.
     */
    fun curar(cantidad: Int) {
        vida += cantidad
        println("Te has curado, vida actual: $vida")
    }
}