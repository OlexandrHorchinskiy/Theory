package arrays;

import java.util.Scanner;

public class ArrayInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbersOfTests = input.nextInt();

        int[][] arrayTests = new int[numbersOfTests][2];

        // Заповнення масиву значеннями
        for (int numberTest = 0; numberTest < numbersOfTests; numberTest++) {
            arrayTests[numberTest][0] = Integer.parseInt(input.next());
            arrayTests[numberTest][1] = Integer.parseInt(input.next());
        }

        for (int numberTest = 0; numberTest < numbersOfTests; numberTest++) {
            System.out.println(arrayTests[numberTest][0] + " + " + arrayTests[numberTest][1] + " = " +
                    ( arrayTests[numberTest][0] + arrayTests[numberTest][1] ));
        }
    }
}