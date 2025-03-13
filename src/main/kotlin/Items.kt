package org.practicatrim2
//Items usa genéricos para que las habilidades de los objetos puedan aplicarse a más de una clase

/**
 * Representa un objeto dentro del juego con un nombre, descripción y una habilidad que puede ser aplicada a un tipo genérico `T`.
 * Esta clase usa genéricos para permitir que las habilidades asociadas a los objetos puedan aplicarse a diferentes tipos de clases.
 *
 * @param T El tipo al cual se aplica la habilidad. Puede ser cualquier clase que se pase como parámetro al crear el objeto.
 * @property nombre El nombre del objeto.
 * @property descripcion Una descripción breve del objeto y su función.
 * @property habilidad Una función de tipo `(T) -> Unit` que representa la habilidad del objeto. Esta habilidad se aplica a un objeto de tipo `T` y no devuelve valor.
 *
 * @constructor Crea un nuevo objeto con el nombre, descripción y habilidad especificados.
 */
data class Items<T>(
    val nombre: String,
    val descripcion: String,
    val habilidad: (T) -> Unit //Unit no retorna ningún valor, simplemente ejecuta una acción
)
