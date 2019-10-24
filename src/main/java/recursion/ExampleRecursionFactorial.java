package recursion;

// Рекурсія - це виклик метода в тілі цього ж метода.
// При використанні рекурсії необхідна умова виходу з метода.
public class ExampleRecursionFactorial {
    public static void main(String[] args) {
        // факторіал числа
        // 4! = 4 * 3 * 2 * 1
        // 1! = 1
        // 0! = 1

        int n = 15;
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if (n == 1) // умова виходу з метода
            return 1; // вихід з метода

        return n * factorial(n - 1);
    }
}