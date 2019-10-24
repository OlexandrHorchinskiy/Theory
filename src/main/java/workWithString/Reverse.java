package workWithString;

public class Reverse {
    public static void main(String[] args) {
        String str = "A B C D E F G";
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        str = stringBuilder.toString();
        System.out.println(str);
    }
}