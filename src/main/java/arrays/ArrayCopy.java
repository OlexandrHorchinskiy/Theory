/*
Копіювання масиву
qaru.site/questions/175238/resize-an-array-while-keeping-current-elements-in-java
*/
package arrays;
public class ArrayCopy {
    public static void main(String[] args) {
// Оголошення масиву та наповнення його даними
        int[] Array1 = {1, 2, 3};

// Оголошення масиву та встановлення його розміру, всі дані масиву 0
        int[] Array2 = new int[6];

// Копіювання масиву
        System.arraycopy(Array1, 0, Array2, 0, Array1.length);

// Виведення в консоль всіх елементів масиву Array2
        System.out.println("Елементи масиву Array2: ");
        for (int indexArray2 = 0; indexArray2 < Array2.length; indexArray2++) {
            System.out.println("індекс № " +indexArray2+ " = " +Array2[indexArray2]);
        }
    }
}

/*
http://developer.alexanderklimov.ru/android/java/array.php#arraycopy
*/