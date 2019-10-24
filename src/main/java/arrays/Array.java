package arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
// оголошення масиву типу "int" з назвою "array1" та наповнення його даними "{0, 1, 2}"
        int[] array1 = {10, 20, 30};

// оголошення масиву типу "int" з назвою "array2" та встановлення його розміру "[4]", всі елементи масиву поки що = "0"
        int[] array2 = new int[4];

// перезаписуємо значення 1-го та 2-го елементів масиву
        array1[0] = 20;
        array1[1] = 25;

// вивід в консоль 2-го елементу масиву
        System.out.println("2-й елемент масиву \"array1\": " + array1[1]);

// вивід в консоль розміру масиву
        System.out.println("розмір масиву \"array1\": " + array1.length);

// вивід в консоль всіх елементів масиву
        System.out.print("всі елементи масиву \"array1\" спосіб-1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ", ");
        }

// вивід в консоль всіх елементів масиву
        System.out.print("\nвсі елементи масиву \"array1\" спосіб-2: ");
        System.out.println(Arrays.toString(array1));

    }
}

/*
10 часто используемых методов для работы с массивом в Java.

    0. Объявление массива
String[] aArray = new String[5];
String[] bArray = {"a","b","c", "d", "e"};
String[] cArray = new String[]{"a","b","c","d","e"};

    1. Вывод массива в Java
int[] intArray = { 1, 2, 3, 4, 5 };
String intArrayString = Arrays.toString(intArray);

// print directly will print reference value
System.out.println(intArray);
// [I@7150bd4d

System.out.println(intArrayString);
// [1, 2, 3, 4, 5]

    2. Создание ArrayList из массива
String[] stringArray = { "a", "b", "c", "d", "e" };
ArrayList arrayList = new ArrayList(Arrays.asList(stringArray));
System.out.println(arrayList);
// [a, b, c, d, e]

    3. Проверка массива на наличие конкретного значения
String[] stringArray = { "a", "b", "c", "d", "e" };
boolean b = Arrays.asList(stringArray).contains("a");
System.out.println(b);
// true

    4. Объединение двух массивов
int[] intArray = { 1, 2, 3, 4, 5 };
int[] intArray2 = { 6, 7, 8, 9, 10 };
// Apache Commons Lang library
int[] combinedIntArray = ArrayUtils.addAll(intArray, intArray2);

    5. Объявление массива в одной строке
method(new String[]{"a", "b", "c", "d", "e"});

    6. Объединение элементов массива в строку
// containing the provided list of elements
// Apache common lang
String j = StringUtils.join(new String[] { "a", "b", "c" }, ", ");
System.out.println(j);
// a, b, c

    7. Преобразование ArrayList в массив
String[] stringArray = { "a", "b", "c", "d", "e" };
ArrayList arrayList = new ArrayList(Arrays.asList(stringArray));
String[] stringArr = new String[arrayList.size()];
arrayList.toArray(stringArr);
for (String s : stringArr)
	System.out.println(s);

    8. Преобразование массива во множество (Set)
Set set = new HashSet(Arrays.asList(stringArray));
System.out.println(set);
//[d, e, b, c, a]

    9. Возврат массива с элементами в обратном порядке
int[] intArray = { 1, 2, 3, 4, 5 };
ArrayUtils.reverse(intArray);
System.out.println(Arrays.toString(intArray));
//[5, 4, 3, 2, 1]

    10. Удаление элемента из массива
int[] intArray = { 1, 2, 3, 4, 5 };
int[] removed = ArrayUtils.removeElement(intArray, 3);//create a new array
System.out.println(Arrays.toString(removed));

    И еще - создание массива типа byte на основе значения типа int
(прим. берем ByteBuffer, выделяем в нем 4 байта и кладем число int 8, затем все это (0, 0, 0, 8) преобразуем в массив типа byte с помощью вызова array())
byte[] bytes = ByteBuffer.allocate(4).putInt(8).array();

for (byte t : bytes) {
   System.out.format("0x%x ", t);
}
*/