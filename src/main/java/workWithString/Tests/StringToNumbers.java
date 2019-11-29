package workWithString.Tests;

/*
 * Перетворення стрічки з чисел розділених пропусками в масив окремих чилел.
 */
public class StringToNumbers {
    public static void main(String[] args) {
        String inputData = "1 2 -3 4 55555.5 6 -777 8 9"; // стрічка чисел розділених пропусками (по одному пропуску між числами).
        System.out.println("стрічка чисел розділених пропусками\n" + inputData);


        // Розділення рядка тексту та поміщення його в масив (елемент масиву це текст, що відділений від іншого тексту в рядку одним пропуском).
        String[] inputDataArray = inputData.split("[ ]");


        // Перетворення масива символів в масив цифр.
        int[] numbers = new int[inputDataArray.length];
        for (int i = 0; i < inputDataArray.length; i++) {
            numbers[i] = Integer.parseInt(inputDataArray[i]);
        }


        //
        System.out.println("\nмасив окремих чилел");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}