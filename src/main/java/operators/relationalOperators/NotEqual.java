package operators.relationalOperators;

public class NotEqual {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        //!= - не дорівнює (not equal)
        if (a != b) {
            System.out.println(a + " не дорівнює " + b);
        } else {
            System.out.println(a + " дорівнює " + b);
        }
    }
}