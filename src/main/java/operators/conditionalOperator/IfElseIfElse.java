package operators.conditionalOperator;

public class IfElseIfElse {
    public static void main(String[] args) {
        int a = 15;

        if (a == 1) {                                   // перевіряється умова "a == 1"
            System.out.println("a = один");             // якщо умова "a == 1" true, то виконується код в фігурних дужках {}
        } else if (a == 2) {                            // якщо умова "a == 1" false, то перевіряється умова "a == 2"
            System.out.println("a = два");              // якщо умова "a == 2" true, то виконується код в фігурних дужках {}
        } else {
            System.out.println("a != один\na != два");  // якщо попередні умови false, то виконується код в фігурних дужках {}
        }

        System.out.println("Завершено");
    }
}