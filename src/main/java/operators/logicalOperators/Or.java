package operators.logicalOperators;

public class Or {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        int c = 0;

        if (a > 0 || b > 0 || c > 0) {                                      // перевіряється умова "a > 0 || b > 0 || c > 0"
            System.out.println("одне зі значень a, b або c більше за 0");   // якщо "a > 0" або "b > 0" або "c > 0" true, то виконується код в фігурних дужках {}
        }
    }
}