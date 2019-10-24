package operators.relationalOperators;

public class MoreThan {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        //>  - більше ніж (more than)
        if (a > b) {
            System.out.println(a + " більше ніж " + b);
        } else {
            System.out.println(a + " не більше ніж " + b);
        }
    }
}