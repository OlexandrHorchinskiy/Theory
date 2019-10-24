package arrays;

import java.util.Random;

public class ArrayShuffle {
    public static void main(String[] args) {

// оголошення масиву та наповнення його даними {0, 1, 2}
        int[] array1 = {10, 20, 30, 40, 50, 60};

// вивід в консоль всіх елементів масиву
        System.out.print("всі елементи масиву до перемішування:\t\t");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+ ", ");
        }

// перемішування масиву
        Random rnd = new Random();
        for (int i = 1; i < array1.length; i++) {
            int j = rnd.nextInt(i);
            int temp = array1[i];
            array1[i] = array1[j];
            array1[j] = temp;
        }

// вивід в консоль всіх елементів масиву
        System.out.print("\nвсі елементи масиву після перемішування:\t");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+ ", ");
        }
    }
}