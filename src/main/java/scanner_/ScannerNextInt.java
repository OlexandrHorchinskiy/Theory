package scanner_;

import java.util.Scanner;

public class ScannerNextInt {
    public static void main(String[] args) {
// Приклад 1
        System.out.println("Приклад 1");

        System.out.print("Введіть будь яке ціле число від 1 до 10: ");
        Scanner input1 = new Scanner(System.in);
        int number = input1.nextInt();
        System.out.println("Ви ввели число: " + number);


// Приклад 2
        System.out.println("\nПриклад 2");

        Scanner input2 = new Scanner(System.in);
        System.out.println("Введіть 2 будь яких цілих числа: ");
        int number1 = input2.nextInt(); //считывает первое число и присваивает значение в number1
        int number2 = input2.nextInt(); //считывает второе число и присваивает значение в number2
        System.out.print("Сума чисел " + number1 + " та " + number2 + " дорівнює " + (number1+number2)); //выводит сумму number1 + number2
    }
}
