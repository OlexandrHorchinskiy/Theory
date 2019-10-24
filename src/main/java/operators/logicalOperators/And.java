package operators.logicalOperators;

public class And {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        if (a > 0 && b > 0 && c > 0) {          // перевіряється умова "a > 0 && b > 0 && c > 0"
            System.out.println("всі значення a, b та c більші за 0");  // якщо "a > 0" та "b > 0" та "c > 0" true, то виконується код в фігурних дужках {}
        }
    }
}