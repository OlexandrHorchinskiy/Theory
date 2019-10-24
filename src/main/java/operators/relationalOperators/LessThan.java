package operators.relationalOperators;

public class LessThan {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        //<  - менше ніж (less than)
        if (a < b) {
            System.out.println(a + " менше ніж " + b);
        } else {
            System.out.println(a + " не менше ніж " + b);
        }
    }
}