package timeAndDate.localDate;

public class LocalDate {
}


// https://metanit.com/java/tutorial/12.3.php
/*
Класс LocalDate из пакета java.time предназначен для работы с датами.
Функиционал этого класса позволяет создавать даты и изменять их, добавляя и отнимая необходимое количество дней/месяцев/лет.


Основные методы LocalDate:

static LocalDate now(): возвращает объект, который представляет текущую дату

static LocalDate of(int year, int month, int day): возвращает объект, который представляет дату с определенными годом, месяцем и днем

int getYear(): возвращает год даты

int getMonthValue(): возвращает месяц

int getDayOfMonth(): возвращает день месяца (значение от 1 до 31)

int getDayOfYear(): возвращает номер деня года (значение от 1 до 365)

DayOfWeek getDayOfWeek(): возвращает день недели в виде значения перечисления DayOfWeek

LocalDate plusDays(int n): добавляет к дате некоторое количество дней

LocalDate plusWeeks(int n): добавляет к дате некоторое количество недель

LocalDate plusMonths(int n): добавляет к дате некоторое количество месяцев

LocalDate plusYears(int n): добавляет к дате некоторое количество лет

LocalDate minusDays(int n): отнимает от даты некоторое количество дней

LocalDate minusMonths(int n): отнимает от даты некоторое количество месяцев

LocalDate minusWeeks(int n): отнимает от даты некоторое количество недель

LocalDate minusYears(int n): отнимает от даты некоторое количество лет

int getMonthValue(): возвращает месяц
*/