package workWithString;
/*
* Заміна символів та груп символів
*/
public class Replace {
    public static void main(String[] args) {
        String str = "Hello world";

        String replStr1 = str.replace('l', '_'); // Heddo wordd
        System.out.println("Заміна всіх \"l\" на \"_\". Результат: \"" + replStr1 + "\"");

        String replStr2 = str.replace("Hello", "Bye"); // Bye world
        System.out.println("Заміна \"Hello\" на \"Bye\". Результат: \"" + replStr2 + "\"");
    }
}
/*
// Замена в строке //
    // 1. replace()
        позволяет заменить в строке символ или последовательность символов на другую:
        String str = "Hello world";
        String replStr1 = str.replace('l', 'd'); // Heddo wordd
        String replStr2 = str.replace("Hello", "Bye"); // Bye world
*/