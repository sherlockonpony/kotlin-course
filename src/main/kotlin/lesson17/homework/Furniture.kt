package com.sherlockonpony.amkkc.lesson17.homework

//3.Иерархия Мебели
//Базовый класс: Мебель
//Производные классы: …
//Дополнительное разветвление для …: …

open class Furniture(
    val material: String,
    val weight: Double)

class Chair(
    material: String,
    weight: Double,
    val numberOfLegs: Int
) : Furniture(material, weight)

class Table(
    material: String,
    weight: Double,
    val shape: String
) : Furniture(material, weight)