package com.sherlockonpony.amkkc.lesson15.homework

object moon {
    var isVisible: Boolean = false
    var phase: String = "New Moon"

    fun showPhase(){
        if (isVisible) {
            phase = "Full Moon"
        }
        println(phase)
    }
}

//Создайте объект Moon, который будет представлять Луну. Добавьте свойства isVisible (Boolean),
//чтобы отображать, видна ли Луна в данный момент, и phase (String), чтобы отображать текущую фазу Луны
//(например, "Full Moon", "New Moon"). Добавьте метод showPhase(), который выводит текущую фазу Луны.
