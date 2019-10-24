package sorting;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
// Оголошення масиву
        int[] array = {1, 2, -3, 100, -101, -2, 1100};

// Вивід масиву в консоль
        System.out.print("Масив до сортування:\t\t\t\t\t\t");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }


// Сортування від меншого до більшого
        Arrays.sort(array);

// Вивід масиву в консоль
        System.out.print("\nМасив після сортування командою \'sort\':\t\t");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
