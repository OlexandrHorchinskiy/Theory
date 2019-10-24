package random;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumeric1 = random.nextInt(1000);
        System.out.println("Випадкове число 1: " + randomNumeric1);

        int randomNumeric2 = random.nextInt(1000);
        System.out.println("Випадкове число 2: " + randomNumeric2);

        int randomNumeric3 = random.nextInt(1000);
        System.out.println("Випадкове число 3: " + randomNumeric3);

        int min = 15;
        int max = 20;
        int randomNumeric4 = random.nextInt(max - min + 1) + min; // в діапазоні від min до max включно ці числа
        System.out.println("Випадкове число 4 від " +min+ " до " +max+ ": " + randomNumeric4);
    }
}