package com.sherlockonpony.amkkc.lesson7

fun main() {
//1.Напишите цикл for, который выводит числа от 1 до 5.
    for (i1 in 1..5) {
        println(i1)
    }
//2.Напишите цикл for, который выводит четные числа от 1 до 10.
    for (i2 in 1..10) {
        if (i2 % 2 == 0) println(i2)
    }
//3.Создайте цикл for, который выводит числа от 5 до 1.
    for (i3 in 5 downTo 1) {
        println(i3)
    }
//4.Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    for (i4 in 10 downTo 1) {
        println(i4 - 2)
    }
//5.Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
    for (i5 in 1..9 step 2) {
        println(i5)
    }
//6.Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
    for (i6 in 1..20 step 3) {
        println(i6)
    }
//7. Использование До (until): Используйте цикл for и until, чтобы вывести числа из диапазона 1-9 (9 не включается).
    for (i7 in 1 until 9) {
        println(i7)
    }
//8.Напишите цикл for с until, чтобы вывести числа от 3 до 15, не включая 15.
    for (i8 in 3 until 15) {
        println(i8)
    }
//9.Создайте цикл while, который выводит квадраты чисел от 1 до 5.
    val i9 = 1
    while (i9 <= 5) {
        println(i9 * i9)
    }
//10.Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
    val i10 = 10
    while (i10 == 10) {
        println(i10 - 5)
    }
//11.Используйте цикл do...while, чтобы вывести числа от 5 до 1.
    val i11 = 1
    do {
        println("5, 4, 3, 2, 1")
    } while (i11 == 2)
//12.Создайте цикл do...while, который повторяется, пока счетчик меньше 10, начиная с 5.
    val i12 = 5
    do {
        println("пока счетчик меньше 10")
    } while (i12 < 10)
//13.Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    for (i13 in 1..10) {
        if (i13 == 6) break
        println(i13)
    }
//14.Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
    var i14 = 1
    while (i14 >= 0) {
        if (i14 == 10) break
        println(i14++)
    }

//15.В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    for (i15 in 1..10) {
        if (i15 % 2 == 0) continue
        println(i15)
    }
//16.Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
    val i16 = 1
    while (i16 <= 10) {
        if (i16 % 3 == 0) continue
        println(i16)
    }
}

//Создать цикл в цикле, в каждом использовать диапазон от 1 до 10.
// В консоль вывести результат умножения переменных цикла.\
// Результат умножения выводить через print() и добавлять ещё
// один print(“ ”) с пробелом, чтобы отделять значения в строку.
// После вложенного цикла выводить пустой println() чтобы
// следующий проход начинать с новой строки.
// Результат должен быть как на картинке.