package methods;
public class Method_3 {
    public static void main(String[] args) {
        int a = 11;
        int b = 6;
        int c = minMethod(a, b);
        System.out.println("Минимальное значение = " + c);
    }

// Метод для возвращания минимального из двух чисел
    private static int minMethod(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }
}