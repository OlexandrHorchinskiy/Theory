package operators.conditionalOperator;

public class IfElseIf {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;

        if (a == 5) {                           // перевіряється умова "a == 5"
            System.out.println("a = п'ять");    // якщо умова "a == 5" true, то виконується код в фігурних дужках {}
        } else if (b == 4) {                    // якщо умова "a == 5" false, то перевіряється умова "b == 4"
            System.out.println("b = чотири");   // якщо умова "b == 4" true, то виконується код в фігурних дужках {}
        }                                       // якщо умова "b == 4" false, то нічого не відбувається і програма виконується далі

        System.out.println("Завершено");
    }
}