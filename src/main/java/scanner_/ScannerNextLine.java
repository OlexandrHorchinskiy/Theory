package scanner_;

import java.util.Scanner;

public class ScannerNextLine {
    public static void main(String[] args) {
// Приклад 1
        System.out.println("Приклад 1");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть будь яке слово чи фразу: ");
        String phrase = sc.nextLine();
        System.out.println(phrase);


// Приклад 2
        System.out.println("\nПриклад 2");

        Scanner input = new Scanner(System.in);
        System.out.println("Введіть будь які 2 слова чи фрази: ");
        String phrase1 = input.nextLine();
        String phrase2 = input.nextLine();
        System.out.println(phrase1 + " " + phrase2);
    }
}
