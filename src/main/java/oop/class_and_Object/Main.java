package oop.class_and_Object;

public class Main {
    public static void main(String[] args) {
    // Об'єкт класу "Box"
        // Створення об'єкту класу "Box" де клас "Box" виступає в ролі типу змінної.
        // "myBox" - назва об'єкту класу "Box". Оператор "new" створює новий об'єкт класу "Box".
        Box myBox = new Box();

        // Для зміни властивостей (полів) об'єкту "myBox" класу "Box" після назви об'єкту ставиться оператор "." (крапка).
        myBox.width = 2;
        myBox.height = 3;
        myBox.length = 4;

        // Для виклику методу класу "Box" після назви об'єкту "myBox" ставиться оператор "." (крапка).
        double myBoxVolume = myBox.Volume(); // "double volume = " - оголошення змінної
                                             // "myBox.Volume()" - виклику методу "Volume" з класу "Box" для об'єкту "myBox".

//**********************************************************************************************************************
        Box myBox2 = new Box();
        myBox2.width = 5;
        myBox2.height = 5;
        myBox2.length = 5;
        double myBox2Volume = myBox2.Volume();

//**********************************************************************************************************************
        System.out.println(myBoxVolume);
        System.out.println(myBox2Volume);
    }
} // Клас з методом "main" - один в програмі.