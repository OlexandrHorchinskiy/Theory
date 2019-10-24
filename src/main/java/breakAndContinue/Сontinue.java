package breakAndContinue;

// Знайти суму всіх не відємних чисел
public class Сontinue {
    public static void main(String[] args) {
//        оголошення масиву
        int[] array = {1, 2, -3, 100, -101, -2, 1100};

//        оголошення змінної
        int sum = 0;

//        цикл
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0)
                continue; // якщо якщо умова (array[i] < 0) True, то continue пропускає в циклі поточну ітерацію
            sum += array[i];
        }

//        вивід в консоль змінну sum
        System.out.println(sum);
    }
}