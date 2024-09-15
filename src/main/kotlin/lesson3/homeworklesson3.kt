package com.sherlockonpony.amkkc.lesson3

val name: String = "Hackathon Survival Hunger Games 2024"//Название мероприятия "Hackathon Survival"
var date: String = "13.12.2024"//Дата проведения. VAR - 'cuz it can be changed maybe if smth happens
val place: String = "Moscow, RedSquare, Middle Point" //Место проведения
private val finbudget: String = "50k USD" // бюджет заложен. то что он поменяется это другое. Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
var participant: Int = 0
    get() = field
    private set(value) {field=value} //Количество участников
var runningtime: Long = 72*60*60L // часов запланировано, но может поменяться. Длительность хакатона
private lateinit var contactInfo: String = ""//Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
var status: String = ""//Текущее состояние хакатона (статус)
var funder: String = ""//Список спонсоров
var finbudgetFact: Int = 0
    get() = field
    private set(value) {field=value}    //Бюджет мероприятия
var InternetAccesLevel: Int = 0 //Текущий уровень доступа к интернету
private lateinit var supplyChainInfo: String = //Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
var teamQty: Int = 0//Количество команд
val tasks: String = ""//Перечень задач
val evacuationPlan: String = ""//План эвакуации
val fullEquipmentList: String = ""//Список доступного оборудования
var freeEquipmentList: Int = 0//Список свободного оборудования
lateinit var lunchTime: String = ""//График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
private val staffPlan: String = ""//План мероприятий на случай сбоев
val jury: String = ""//Список экспертов и жюри
val feedback: String by lazy {  } //Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
private val pivacyPolicy: String = ""//Политика конфиденциальности
private val privateFeedback: String by lazy {  }//Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
var temperature: Int = 0 //Текущая температура в помещении
var capacityLevel: Int = 0//Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.
val illumination: Int = 0//Уровень освещения
private var log: String = ""//Лог событий мероприятия
var ambulanceAvailability: Boolean? = null//Доступность медицинской помощи
private val staffEmergencyPlan: String = ""//Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
val eventId: String = ""//Регистрационный номер мероприятия
val noiseMax: Int = 0//Максимально допустимый уровень шума в помещении хакатона.
var noiseCurrent: Boolean? = null //Индикатор превышения уровня шума в помещениях
var eventType: String = ""//Формат мероприятия (зависит от геополитической обстановки)
var availableSitting: Int = 0
    get() = field
    set(value) {
        if (value>=0) field = value
    } //Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.
var pressCommunicationPlan: String = ""//План взаимодействия с прессой
private val teamsWorkPlan: String = ""//Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
private var permissionStatus: String = ""//Статус получения всех необходимых разрешений
private val exclusiveAvailability: String = ""//Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)
private val partners: String = ""//Список партнеров мероприятия
val totalReport: String by lazy {  }//Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
private val celebrationPlan: String = ""//План распределения призов
private const val emergencyList: String =  ""//Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.
val paraolympic: String = ""//Особые условия для участников с ограниченными возможностями
val mood: String by lazy {  }//Общее настроение участников (определяется опросами)
lateinit val eventDetailedPlan: String = ""//Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.
lateinit var specialGuest: String = ""//Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
val maxParticipants: Int = 0//Максимальное количество людей, которое может вместить место проведения.
val maxTimeForTask: Long = 0L//Стандартное количество часов, отведенное каждой команде для работы над проектом.