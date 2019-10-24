package operators.relationalOperators;

public class EqualTo {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        //== - дорівнює (is equal to)
        if (a == b) {
            System.out.println(a + " дорівнює " + b);
        } else {
            System.out.println(a + " не дорівнює " + b);
        }
    }
}