package com.sherlockonpony.amkkc.org.kotlincoursehws

val name: String = "Hackathon Survival 2024" // наименование мероприятия

var date: String = '13/09/2024' // запланированная дата мероприятия

val place: String = "Moscow, RedSquare, Middle Point" // адрес мероприятия

private val budget: String = "123 USD" // заложенный бюджет

var member: Int = 0
    get() = field
    private set(value) {field=value} // число участников может быть изменено, но не может быть отрицательным

var duration: Long = 2*24 // Длительность мероприятия может быть изменена

private lateinit var contactinfo: String // контактная информация будет предоставлена позднее

var status: String = "Не начат"// статус мероприятия

val sponsor: String = "список спонсоров" // может меняться?

var internetAccesLevel: Int = 0 // уровень интернета может быть разным

val  mood: String by lazy { } // настроение определяется по результатам опроса

private var information: String = "информация о транспортировке" //

lateinit var plan: String // подробный план хакатонаможет меняться

lateinit var specialGuest: String // специальный гость который будет объёявлен

var CommandQty: Int = 0 // количество команд пока 0, будет меняться по мере регистрации

val tasks: String = "Задачи" // перечень задач зафиксирован и озвучен ранее командам

val evacuationPlan: String = "Таблица-схема Эвакуации" // картина на стене

var listOfAvailiableEquipment: String = "50" // стартовое количество свободной техники

var listOfAvailiableEquipment: String = "50" // количество свободной техники

val planInCaseOfFailure: String = "План действий на случай сбоя" //