/*
Збільшення масиву методом перезапису в новий масив (запис масиву Array1 в масив Array2 та запис нових елементів до масиву Array2)
*/
package arrays;
public class AddDataToArray {
    public static void main(String[] args) {
        int[] Array1 = {1, 2, 3};

// Змінна для визначення кількості додаткових елементів масиву
        int addElementsToArray = 3;

// Змінна для визначення розміру масиву Array2 (розмір масиву Array1 + додаткові елементи масиву)
        int newArraySize = Array1.length + addElementsToArray;

// Оголошення масиву Array2 та встановлення його розміру, всі дані масиву 0
        int[] Array2 = new int[newArraySize];

// Копіювання елементів масиву Array1 до масиву Array2
        System.arraycopy(Array1, 0, Array2, 0, Array1.length);

// Запис нових елементів до масиву Array2
        for (int indexArray2 = Array1.length; indexArray2 + 1 < newArraySize + 1; indexArray2++) {
            Array2[indexArray2] = 555;
        }

// Виведення в консоль всіх елементів масиву Array2
        System.out.println("Елементи масиву Array2: ");
        for (int indexArray2 = 0; indexArray2 < Array2.length; indexArray2++) {
            System.out.println("індекс № " +indexArray2+ " = " +Array2[indexArray2]);
        }
    }
}
