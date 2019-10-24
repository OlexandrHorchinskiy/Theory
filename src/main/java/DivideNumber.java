public class DivideNumber {
    public static void main(String[] args) {
        int digit = 235;

        int a = digit / 100;
        int b = digit / 10 % 10;
        int c = ( digit % 100 ) % 10;
        System.out.println("число " + digit + " складається з цифр: " + a + ", " + b + ", " + c);
    }
}