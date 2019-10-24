package breakAndContinue;

public class Break {
    public static void main(String[] args) {
//        оголошення масиву
        int[] array = {1, 2, 3, 100, 101, 2, 1100};

//        оголошення змінної
        int x = 2;

//        цикл
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("x знайдено в масиві має індекс " + i);
                break; // якщо умова (array[i] == x) True, то break зупиняє цикл
            }
        }
    }
}
