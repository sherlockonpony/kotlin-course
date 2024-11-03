package com.sherlockonpony.amkkc.lesson17.homework

//2.Учебные Заведения
//Базовый класс: Учебное Заведение
//Производные классы: Школа, …
//Дополнительное разветвление для …: …

open class EducationalInstitution(
    val name: String,
    val address: String
)

class School(
    name: String,
    address: String,
    val numberOfStudents: Int
) : EducationalInstitution(name, address)