import java.util.Scanner;

public class GetFirstNumber {
    public static void main(String[] args) {
        String numberAndWord = "154 Java";

        Scanner scanner = new Scanner(numberAndWord);
        int number = scanner.nextInt();
        String word = scanner.next();

        System.out.println("Число int: " + number);
        System.out.println("Слово: " + word);
    }
}