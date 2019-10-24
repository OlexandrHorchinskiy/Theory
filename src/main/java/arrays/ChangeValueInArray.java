package arrays;

public class ChangeValueInArray {
    public static void main(String[] args) {
// Оголошення масиву та наповнення його даними
        int[] myArray = {1, 2, 3};

// Вивід на екран всіх елементів масиву
        System.out.println("Елементи масиву myArray:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i] + " ");
        }

// Вивід на екран всіх елементів масиву в одну стрічку
        System.out.println("Елементи масиву myArray стрічкою:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

// Change value of array elements
        myArray[0] = 3;
        myArray[1] = 2;
        myArray[2] = 1;

// Вивід на екран всіх елементів масиву в одну стрічку
        System.out.println("\nЕлементи масиву myArray стрічкою:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}