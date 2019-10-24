package operators.logicalOperators;

public class Exception {
    public static void main(String[] args) {
        int a = -1;
        int b = 2;

        if (a > 0 ^ b > 0) {                                          // перевіряється умова "a > 0 ^ b > 0"
            System.out.println("одне з значень a або b більше за 0"); // якщо одна з "a > 0" або "b > 0" true, то виконується код в фігурних дужках {}
        }
    }
}