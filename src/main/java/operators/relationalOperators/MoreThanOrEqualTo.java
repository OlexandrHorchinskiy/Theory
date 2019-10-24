package operators.relationalOperators;

public class MoreThanOrEqualTo {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        //>= - більше або дорівнює (more than or equal to)
        if (a >= b) {
            System.out.println(a + " більше або дорівнює " + b);
        } else {
            System.out.println(a + " менше ніж " + b);
        }
    }
}