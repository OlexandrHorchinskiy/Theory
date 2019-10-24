package recursion;

// Рекурсія - це виклик метода в тілі цього ж метода.
// При використанні рекурсії необхідна умова виходу з метода.
public class ExampleRecursion {
    public static void main(String[] args) {
        int n = 3;
        counter(n);
    }

    private static void counter(int n) {
        if (n == 0) // умова виходу з метода
            return; // вихід з метода

        System.out.println(n);
        counter(n - 1);
    }
}