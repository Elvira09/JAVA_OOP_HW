HW1
При решении этих задач следуйте принципам абстракции, инкапсуляции, наследования, полиморфизма.    Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.
Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат и реализуйте перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт, соответствующий имени, объему и температуре.
В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков и позвольте покупателю купить товар.

HW2
Имеются данные о группе студентов. У каждого студента есть средний балл (например, 4.6).
Создайте родительский класс ЗаписывательВФайл. Создайте три детских класса, которые записывают в файл информацию о студентах в разных формах: Иван Иванов=4.8 Мария Кузнецова=5.0 Степан Кузьмин=3.6
TXT
JSON:
XML

HW3
1. Класс Группа содержит в себе коллекцию Студентов. По группе можно перемещаться с помощью итератора. (Это повторяет 1-ю задачу из классной работы). Остальные задачи надстраиваются поверх неё.

    Создайте класс Student. У студента есть имя, дата рождения и средний балл. Переопределите функцию toString ( ).
    Создайте класс StudentGroup. Она содержит коллекцию студентов.
    Для коллекции StudentGroup создайте парный класс итератора: StudentGroupIterator. Он реализует интерфейс Iterator<Student>. Он отслеживает текущую позицию в итерации.
    Класс StudentGroup реализует интерфейс Iterable<Student>. Это позволяет начать итерацию по группе.


2. Создайте класс GroupListIterator, который позволяет перемещаться по группе в обоих направлениях. Он реализует интерфейс ListIterator<Student>.
Добавьте в Группу метод listIterator (), который позволяет начать итерацию с помощью GroupListIterator.

3. Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
• Он отслеживает текущую позицию в переборе
• Он изначально выставлен на конечную позицию
• Он движется справа налево
Проверьте, как он работает.

HW4
1. Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
boolean isGood (T item);
Смысл этого интерфейса: ему дают элемент, он его одобряет или не одобряет.
Создайте следующие детские классы:
• IsEven — ему дают целое число, он одобряет его, если оно чётное
• IsPositive — ему дают целое число, он одобряет его, если оно положительное
• BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
• BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет, что она начинается с того, что он запомнил

2. Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и одобрятель IsGood.
Функция возвращает новую коллекцию, куда входят только одобренные элементы из коллекции.
Продемонстрируйте, что это работает.

HW5
Напишите программу, позволяющую анализировать посещаемость студентов. Используйте паттерн MVP.

Есть группа студентов. Для каждого студента есть журнал его посещаемости: список дат занятий и для каждой даты — посетил студент занятие или нет. Создайте класс AttendanceService (сервис посещаемости), в котором хранится информация обо всех студентах. Создайте класс AttendanceView, который позволяет отображать студентов и их посещаемость.

Создайте класс контроллера со следующими функциями:
* Распечатать всех студентов и посещаемость каждого в процентах
* Распечатать студентов, отсортировав их по убыванию посещаемости
* Распечатать студентов с посещаемостью ниже 25%
