package operators.conditionalOperator;

public class If {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;

        if (b > a) {                        // перевіряється умова "b > a"
            System.out.println("b > a");    // якщо умова "b > a" true, то виконується код в фігурних дужках {}
        }                                   // якщо умова "b > a" false, то нічого не відбувається і програма виконується далі

        System.out.println("Завершено");
    }
}