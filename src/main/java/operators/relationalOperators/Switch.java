package operators.relationalOperators;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.print("Введіть першу літеру області: ");
        String letter = "";
        Scanner scanner = new Scanner(System.in);
        letter = scanner.nextLine();

        System.out.println("Введено: \"" + letter.toLowerCase() + "\"");

        switch (letter.toLowerCase()) {   // змінна для порівняння
            case "з":       // значення, співпадіння з яким змінної "letter" викликає код після ":"
                System.out.println("Закарпатська або Запоріжська");
                break;      // завершення виконання "switch"

            case "ч":       // значення, співпадіння з яким змінної "letter" викликає код після ":"
                System.out.println("Чернівецька або Чернігівська або Черкаська");
                break;      // завершення виконання "switch"

            default:        // якщо жодне зі значеннь не співпало зі змінною "letter" викликає код після ":"
                System.out.println("Область на букву \"" + letter + "\" не знайдено!");
                break;      // завершення виконання "switch"
        }
    }
}