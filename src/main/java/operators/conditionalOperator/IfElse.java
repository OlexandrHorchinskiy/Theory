package operators.conditionalOperator;

public class IfElse {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;

        if (b > a) {                        // перевіряється умова "b > a"
            System.out.println("b > a");    // якщо умова "b > a" true, то виконується код в фігурних дужках {}
        } else {
            System.out.println("b =< a");   // якщо попередня умова false, то виконується код в фігурних дужках {}
        }

        System.out.println("Завершено");
    }
}
