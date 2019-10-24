package variables;

public class GlobalVariables {

    public static int number = 15; // Глобальна змінна

    public static void main(String[] args) {
        System.out.println(number);
        number = 5; // Зміна значення змінної
        System.out.println(number);
        method2();
        System.out.println(number);
    }

    public static void method2 () {
        number = 10;
    }

}
