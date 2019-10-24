package scanner_;

import java.util.Scanner;

public class ScannerNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть будь яке слово чи фразу: ");
        String phrase1 = input.next(); // читає введене в консоль до першого пробілу
        String phrase2 = input.next();
        String phrase3 = input.next();

        System.out.println(phrase1);
        System.out.println(phrase2);
        System.out.println(phrase3);
    }
}

/*
synchronized("hh") {
            System.out.println(phrase2);
            System.out.println(phrase3);
        }
*/


/*
Так как класс Scanner находится в пакете java.util, то мы вначале его импортируем.
Для создания самого объекта Scanner в его конструктор передается объект System.in.
После этого мы можем получать вводимые значения.
Например, чтобы получить введенное число, используется метод in.nextInt();,
который возвращает введенное с клавиатуры целочисленное значение.

В данном случае в цикле вводятся все элементы массива,
а с помощью другого цикла все ранее введенные элементы массива выводятся в строчку.

Класс Scanner имеет еще ряд методов, которые позволяют получить введенные пользователем значения:

next(): считывает введенную строку до первого пробела

nextLine(): считывает всю введенную строку

nextInt(): считывает введенное число int

nextDouble(): считывает введенное число double

hasNext(): проверяет, было ли введено слово

hasNextInt(): проверяет, было ли введено число int

hasNextDouble(): проверяет, было ли введено double

Кроме того, класс Scanner имеет еще ряд методов nextByte/nextShort/nextFloat/nextBoolean,
которые по аналогии с nextInt считывают данные определенного типа данных.
*/