package methods;
public class Method {
    public static void main(String[] args) {
        int[] array1 = {2200, 220, 20, 2}; // оголошення масиву
        printArray(array1); // виклик метода
//        arrayToString(array1); // виклик метода

        int[] array2 = {1, 2, 3, 100, 101, 222, 1100}; // оголошення масиву
        printArray(array2); // виклик метода
//        arrayToString(array2); // виклик метода

// Виклик метода в System.out.println()
        System.out.println("\n" + arrayToString(array1) + "\n" + arrayToString(array2));
    }

// Метод для виводу масиву в консоль / Method for output array to console
    static void printArray (int[] array) {
        System.out.print("\nМасив: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + ", ");
    }

// Метод для запису масиву стрічкою / Method for writing array to string
    private static String arrayToString(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++)
            result += array[i] + ", ";
        return result;
    }
}