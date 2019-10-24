package operators.relationalOperators;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        System.out.print("Введіть цифру від 1 до 10: ");
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        System.out.println("Введено: \"" + number + "\"");

        switch (number) {   // змінна для порівняння
            case 1:         // значення, співпадіння з яким змінної "number" викликає код після ":"
            case 3:         // значення, співпадіння з яким змінної "number" викликає код після ":"
            case 5:         // значення, співпадіння з яким змінної "number" викликає код після ":"
            case 7:         // значення, співпадіння з яким змінної "number" викликає код після ":"
            case 9:         // значення, співпадіння з яким змінної "number" викликає код після ":"
                System.out.println("\"" + number + "\" не парна цифра");
                break;      // завершення виконання "switch"

            case 2:         // значення, співпадіння з яким змінної "number" викликає код після ":"
            case 4:         // значення, співпадіння з яким змінної "number" викликає код після ":"
            case 6:         // значення, співпадіння з яким змінної "number" викликає код після ":"
            case 8:         // значення, співпадіння з яким змінної "number" викликає код після ":"
            case 10:        // значення, співпадіння з яким змінної "number" викликає код після ":"
                System.out.println("\"" + number + "\" парна цифра");
                break;      // завершення виконання "switch"

            default:        // якщо жодне зі значеннь не співпало зі змінною "letter" викликає код після ":"
                System.out.println("Введено не відні дані!");
                break;      // завершення виконання "switch"
        }
    }
}