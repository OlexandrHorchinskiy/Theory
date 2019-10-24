package operators.conditionalOperator;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        // 1 - 10   - "група_1"
        // 11 - 20  - "група_2"
        // 21 - 30  - "група_3"
        System.out.print("Введіть число: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        // якщо умава "(id > 10 && id < 21)" true, то виконується код між "?" та ":"
        // якщо умава "(id > 10 && id < 21)" false, то виконується код після ":"
        double price = ( id > 10 && id < 21 ) ? 1.5 : 2.3;
        System.out.println("Для " + id + " ціна буде " + price);


        // варіант з викликом одного з методів
        System.out.print("Введіть число: ");
        id = scanner.nextInt();
        price = ( id > 10 && id < 21 ) ? ifTrue() : ifFalse();
        System.out.println("Для " + id + " ціна буде " + price);
    }


    private static double ifTrue() {
        return 1.5;
    }

    private static double ifFalse() {
        return 2.3;
    }
}