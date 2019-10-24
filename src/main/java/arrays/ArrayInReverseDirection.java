package arrays;

import java.util.Arrays;

public class ArrayInReverseDirection {
    public static void main(String[] args) {
        // Оголошення масиву та наповнення його даними
        int[] myArray = {1, 2, 3, 4, 5};

        // Вивід на екран всіх елементів масиву
        System.out.println("Елементи масиву myArray:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }

        // Вивід на екран всіх елементів масиву в зворотньому порядку
        System.out.println("\nЕлементи масиву myArray в зворотньому порядку:");
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + ", ");
        }


        // Возврат массива с элементами в обратном порядке
//        ArrayUtils.reverse(myArray);
        System.out.println("__________");
        System.out.println(Arrays.toString(myArray));
    }
}