package com.sherlockonpony.amkkc.lesson6

fun main (){
    println(seasonIndication(9))
    println(petAge(9))
    println(vesselType(15.0))
    println(loyalty(99.9))
    println(docType("doc"))
    println(tempConv(15,"C"))
    println(clothesChoose(13))
    println(movieRank(-1))
}
//В каждом задании также нужно валидировать входящие данные, если это имеет смысл.

fun seasonIndication(month: Int):String {
    return when (month) {
        in 1..2 , 12 -> "Зима"
        in 3..5 -> "Весна"
        in 6..8 -> "Лето"
        in 9..11 -> "Весна"
        else -> "Invalid Error"
    }
}

fun petAge(age: Int): Double {
    return if (age in 0 .. 2 ){
        age * 10.5
    } else
        (2 * 10.5) + ((age - 2) * 4)
}
fun vesselType(distance: Double): String {
    return if (distance < 1) {
        "Пешком"
    } else if (distance in 1.0..5.0){
        "Велосипед"
    }else "Автотранспорт"
}

fun loyalty(buy: Double): Any {
    if (buy < 100) {
        return "Баллы не начислены"
    }
    return if (buy <= 1000.0) {
        (buy / 100) * 2
    } else 10 + ((buy - 1000.0) / 100) * 5
}
fun docType(type: String): String {
    return when(type) {
        in "txt","doc" -> "Текстовый документ"
        in "jpeg","png" -> "Изображение"
        in "xls" -> "Таблица"
        else -> "Неизвестный формат"
    }
}
fun tempConv(value: Int, unit: String): String {
    return if (unit == "C") {
        "${(value * 1.8) + 32} F"
    } else {
        "${(value - 32) / 1.8} C"
    }
}

fun clothesChoose(temp: Int): String {
    return when(temp) {
        in -30..-1 -> "куртка и шапка"
        in 0..15 -> "ветровка"
        in 16..35 -> "футболка и шорты"
        in 17..28 -> "Summer clothes"
        else -> "Рекомендую не выходить из дома"
    }
}

fun movieRank(age: Int): String {
    return if (age < 0 || age > 100) {
        "Неверное значение"
    } else if (age in 0..11) {
        "Детские"
    } else if (age in 12..17) {
        "Подростковые"
    }        else {
        "18+"
    }

}