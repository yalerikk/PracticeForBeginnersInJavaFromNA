# День 3

## Темы
- Операторы `break` и `continue`;
- Оператор `switch`.

## Задачи
### 1 
Реализовать программу, которая в консоль выводит название страны, принимая на
вход название города. Программа должна работать до тех пор, пока не будет введено
слово *“Stop”*.
Реализовать, используя следующие данные:
Москва, Владивосток, Ростов - Россия
Рим, Милан, Турин - Италия
Ливерпуль, Манчестер, Лондон - Англия
Берлин, Мюнхен, Кёльн - Германия
При вводе любого другого города, вывести сообщение “Неизвестная страна”.
*Пример:*
Милан - ваш ввод в консоль
Италия - ответ программы
Дублин - ваш ввод в консоль
Неизвестная страна - ответ программы
Stop - ваш ввод в консоль
*программа завершила работу*<br>
[Решение задачи 1](task_01.java)

### 2 
Реализовать программу, которая пока работает, принимает на вход от пользователя
два числа - делимое и делитель. Для этих двух чисел программа рассчитывает
результат деления и выводит его в консоль. Программа останавливает свою работу
тогда, когда пользователь вводит 0 в качестве делителя.
(для этих вещественных чисел необходимо использовать тип `double` и метод
`nextDouble()` у `Scanner’а` соответственно).
*Пример:*
1 2 - ваш ввод в консоль
0.5 - ответ программы
100 77 - ваш ввод в консоль
1.2987012987012987 - ответ программы
3 0 - ваш ввод в консоль
работа программы завершается
[Решение задачи 2](task_02.java)

### 3 
Реализовать программу, которая 5 раз запрашивает от пользователя два числа -
делимое и делитель. Для этих двух чисел программа рассчитывает результат деления
и выводит его в консоль. Если пользователь вводит 0 в качестве делителя, вместо
того, чтобы останавливать работу цикла принудительно, мы пропускаем итерацию и
выводим в консоль сообщение “Деление на 0”.
Ключевое слово `else` использовать в этой программе нельзя.
*Пример:*
4 2 - ваш ввод в консоль
2 - ответ программы
100 0 - ваш ввод в консоль
Деление на 0 - ответ программы
13 10 - ваш ввод в консоль
1.3 - ответ программы
и так далее… (еще 2 итерации).
[Решение задачи 3](task_03.java)
