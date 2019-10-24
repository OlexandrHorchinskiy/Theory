/*
https://www.youtube.com/watch?v=ufClx4m8TRM&t=0s&list=PLSvsv8dMp1keO63CxKfwCTQ6Z8M6MVnym&index=10
*/
package return_;

public class Return2 {
    public static void main(String[] args) {
        String name1 = "Olexandr"; // Оголошення (створення) змінної
        String textResult = "____"; // Оголошення (створення) змінної
        textResult = SayHello(name1); // Виклик метода "SayHello" та передача йому параметра (змінної) "name1"
        System.out.println(textResult); //Вивід в консоль
    }

    // Метод
    private static String SayHello(String name1) { // Метод приймає змінну (параметр) "name1"
        String text = "Привіт, " + name1 + "!"; // Оголошення (створення) змінної та присвоєння їй значення
        return text; // Повернення (передає) значення змінної "text" тому хто викликав метод ("textResult")
    }
}



/*
    public static void main(String[] args) {
        String name1 = "Olexandr";
        SayHello (name1);
        SayHello("Andriy");
    }

// Метод
    private static void SayHello(String name1) {
        System.out.println("Привіт, " + name1 + "!");
    }
*/