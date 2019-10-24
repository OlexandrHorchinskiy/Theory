package sorting;

public class BubbleSort {
    public static void main(String[] args) {
//      оголошення масиву
        int[] array = {1, 2, -3, 100, -101, -2, 1100};

//      вивід масиву в консоль
        System.out.print("Масив до сортування:\t\t\t\t\t\t\t\t\t\t");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + ", ");



// сортування бульбашками від меншого до більшого
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < ( n - i ); j++) {
                if (array[j - 1] > array[j]) {  // порівнює значення в парі ліве (array[j - 1]) та праве (array[j])
                    //swap elements - обмін елементами
                    temp = array[j - 1];        // в тимчасову змінну записується лівий елемент (array[j - 1])
                    array[j - 1] = array[j];    // в лівий елемент (array[j - 1]) записується правий елемент (array[j])
                    array[j] = temp;            // в правий елемент (array[j]) записується тимчасова змінна (temp)
                }
            }
        }

//      вивід масиву в консоль
        System.out.print("\nМасив після сортування бульбашками від меншого до більшого:\t");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + ", ");


// Сортування бульбашками від більшого до меншого
        int s = array.length;
        int temp2 = 0;
        for (int i = 0; i < s; i++) {
            for (int j = 1; j < ( s - i ); j++) {
                if (array[j - 1] < array[j]) {  // порівнює значення в парі ліве (array[j - 1]) та праве (array[j])
                    //swap elements - обмін елементами
                    temp2 = array[j - 1];        // в тимчасову змінну записується лівий елемент (array[j - 1])
                    array[j - 1] = array[j];    // в лівий елемент (array[j - 1]) записується правий елемент (array[j])
                    array[j] = temp2;            // в правий елемент (array[j]) записується тимчасова змінна (temp)
                }
            }
        }

//      вивід масиву в консоль
        System.out.print("\nМасив після сортування бульбашками від більшого до меншого:\t");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + ", ");
    }
}