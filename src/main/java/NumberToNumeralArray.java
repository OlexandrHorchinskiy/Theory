/*
 * Перетворює число в масив цифр та виводить масив цифр в консоль
 */
public class NumberToNumeralArray {
    public static void main(String[] args) {
        int number = 1234567890;

        // Визначення довжини числа
        System.out.print("Число " + number);
        int numberDuplicate1 = number;
        int numberDivided;
        int quantityNumeralInNumber = 0;
        for (; numberDuplicate1 > 0; numberDuplicate1 /= 10) {
            numberDivided = numberDuplicate1 % 10;
            quantityNumeralInNumber += 1;
        }
        System.out.println(" складається з " + quantityNumeralInNumber + " цифр.");

        // Перетворення числа в масив цифр
        int numberDuplicate2 = number;
        int[] numeralArray = new int[quantityNumeralInNumber];
        int numberDivided2;
        int index = quantityNumeralInNumber;
        for (; numberDuplicate2 > 0; numberDuplicate2 /= 10) {
            numberDivided2 = numberDuplicate2 % 10;
            index -= 1;
            numeralArray[index] = numberDivided2;
        }

        // Вивід масива в консоль
        System.out.print("Число " + number + " складається з наступних цифр: ");
        for (int i = 0; i < numeralArray.length; i++) {
            System.out.print(numeralArray[i] + "; ");
        }
    }
}