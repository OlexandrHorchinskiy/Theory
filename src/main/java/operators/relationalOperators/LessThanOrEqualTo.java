package operators.relationalOperators;

public class LessThanOrEqualTo {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        //<= - менше або дорівнює (less than or equal to)
        if (a <= b) {
            System.out.println(a + " менше або дорівнює " + b);
        } else {
            System.out.println(a + " більше ніж " + b);
        }
    }
}