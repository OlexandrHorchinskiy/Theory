/*
Перетворення стрічки з чисел розділених пропусками в масив окремих чилел.
*/

package workWithString.Tests;

public class StringToNumbers {
    public static void main(String[] args) {
        String str = "1 2 -3 4 55555.5 6 -777 8 9"; // стрічка чисел розділених пропусками (по одному пропуску між числами)
        System.out.println("стрічка чисел розділених пропусками\n" + str);

        // Розділення рядка тексту та поміщення його в масив (елемент масиву це текст що відділений від іншого тексту в рядку пропуском)
        String[] strArray = str.split("[ ]");

        // Перетворення масива символів в масив цифр
        int[] numbers = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            numbers[i] = Integer.parseInt(strArray[i]);
        }

        // Вивід масива в консоль
        System.out.println("\nмасив окремих чилел");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}