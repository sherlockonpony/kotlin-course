package com.sherlockonpony.amkkc.lesson5
//Оператор элвиса
//Задание выполняется в виде функций, принимающих один или более аргументов.
//Все функции должны быть вызваны из функции main() в вариантах с null и с вещественным значением.
//======
//I. Контекст: Вы изучаете физическое явление затухания звука в помещении.
//У вас есть измеренное значение начальной интенсивности звука,
//но из-за ограничений оборудования данные о коэффициенте затухания иногда могут быть неизвестны.
//Задача: Рассчитать предполагаемую интенсивность звука после затухания.
//Интенсивность звука после затухания пропорциональна начальной интенсивности,
//умноженной на коэффициент затухания. Если коэффициент затухания неизвестен, использовать стандартное значение 0.5.
//======
//II. Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз,
//которая составляет 0,5% от его стоимости. В случае, если стоимость не указана,
//то берётся стандартная стоимость в $50
//Задача: Рассчитать полную стоимость доставки.
//=====
//III. Контекст: Вы проводите метеорологические измерения.
//Одним из важных показателей является атмосферное давление,
//которое должно быть зафиксировано. Лаборант приносит вам набор показателей,
//но по пути может что-нибудь потерять.
//Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.

fun main () {
    val initialIntensity = 100.0
    val knownDampingCoefficient: Double? = 0.7
    val intensityWithKnownCoefficient = calculateDampedSoundIntensity(initialIntensity, knownDampingCoefficient)
    println ("Интенсивность звука с известным коэффициентом затухания: $intensityWithKnownCoefficient")
val unknownDampingCoefficient: Double? = null
    val intensityWithUnknownCoefficient = calculateDampedSoundIntensity(initialIntensity, unknownDampingCoefficient)
    println("Интенсивность звука с НЕизвестным коэффициентом затухания: $unknownDampingCoefficient")

    val cargoValue: Double? = null
    val totalCost = calculateTotalShippingCost(cargoValue)
    println("Полная стоимость доставки: $totalCost")
println(calculateTotalShippingCost(300.0))
}

    fun calculateDampedSoundIntensity(initialIntensity: Double, dampingCoefficient: Double?): Double {
        val effectiveDampingCoefficient = dampingCoefficient ?: 0.5
        return initialIntensity * effectiveDampingCoefficient
    }
fun calculateTotalShippingCost(cargoValue: Double?): Double{
val effectiveCargoValue = cargoValue ?: 50.0
val insurance = effectiveCargoValue * 0.005
    val totalShippingCost = effectiveCargoValue + insurance
    return totalShippingCost
}

// 3-я задача не осилена