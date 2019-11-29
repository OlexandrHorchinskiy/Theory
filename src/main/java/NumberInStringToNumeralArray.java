/*
 * Перетворює число записане як String в масив цифр та виводить масив цифр в консоль.
 */
public class NumberInStringToNumeralArray {
    public static void main(String[] args) {
        String number = "01234567890";

        // Перетворення стрічки в масив символів
        char[] numberInCharArray = number.toCharArray();

        // Перетворення масива символів в масив цифр
        int[] numeralArray = new int[number.length()];
        for (int i = 0; i < numeralArray.length; i++) {
            numeralArray[i] = Character.getNumericValue(numberInCharArray[i]);
        }

        // Вивід масива в консоль
        System.out.print("Число " + number + " складається з наступних цифр: ");
        for (int i = 0; i < numeralArray.length; i++) {
            System.out.print(numeralArray[i] + "; ");
        }
    }
}