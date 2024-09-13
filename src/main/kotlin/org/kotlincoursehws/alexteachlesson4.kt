package com.sherlockonpony.amkkc.org.kotlincoursehws

val myInt: Int = 2147483647 //Int.MAX_VALUE или "мин" чтобы посмотреть значения допустимые.один из основных значений

val myFloat: Float = 0.58f // отличие от дабла с буквой ф

val myLong Long = 5 // не понял, пересмотреть. что-то про секунды от рождества Юникса

val myShort Short = 4 // разницы с ИНТ небольшая. РАЗНИЦА В ГРАНИЦАХ

val myBite: Byte = 5 //

val myDouble: Double = 4 //

val isKotlinFun: Boolean = true // только 1 или 0. Правда или Ложь при сравнении 2х строк. используется при проверке IF

val letter; Char = 'A' // всегда ОДИНОЧНЫЙ символ, НЕ ПУСТОЙ, НЕ ДВА, всегда в ОДИНОЧНЫХ кавычках

val text: String = "Hello, Kotlin" // просто строка, любой длины, что угодно что попадает под понятие СИМВОЛ, можно пустой. строка неизменяемая

val numbers: Array<Int> = arrayOf(1, 2, 3) //набор объектов из коллекции
val strings: MutableList<String> = mutableListOf("one", "two") // что-то поплыл. пересмотреть
val doubles: Set<Double> = setOf(23.3, 56.6)

val keysToValues: Map<String, String> = mapOf(
    "Key 1" to "Значение 1"
    "Key 2" to "Значение 2"
)

val anything: Any = true // можно этой переменной присвоить этой переменной. весь код может быть построен на этом, но тогда высокий риск ошибки, числа строки

fun printMessage(message: String): Unit {
    println(message)
} // джава войд. возвращение

fun fail(message: String): Nothing {
    throw
} //никогда не дойдём. но нужно знать.

//таймер конференции 1:35. начинаем практику. в чате зума.

// 100 - int
// 156L - long
// 12.34f - flow
// 123.456 - double
// "hello world" - string
// 'a' - char
// 0 - int

val myInt: Int = Int.MAX_VALUE