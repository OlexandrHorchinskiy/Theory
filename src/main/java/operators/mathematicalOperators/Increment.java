package operators.mathematicalOperators;

public class Increment {
    public static void main(String[] args) {
        int a = 5;
        a = a++;
        System.out.println(a);

        int b = 5;
        b = ++b;
        System.out.println(b);
    }
}