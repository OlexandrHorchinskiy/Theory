package variables;

import javax.management.Attribute;

public class Variables {
    public static void main(String[] args) {
        // Оголошення (декларування) змінної (поля).
        int i; // "int" - тип змінної, "i" - ім'я змінної.

        // Присвоєння значення (ініціалізація) змінній (поля).
        i = 55; // "i" - ім'я змінної, "55" - значення змінної.


        float f = 0;
        f = (float) 5.54321;

        double d = 8.126;

        boolean b = false;
        b = true;

        String s = "зачинено";
        if (b = true) s = "відчинено";


        // Округлення

//        Math.round(f);
//        String.format("%.2f", f);

//        System.out.println("змінна типу int = " + i);
        System.out.println("змінна типу float = " + f);
        System.out.println("змінна типу float = " + String.format("%.2f", f));
        System.out.println("змінна типу float = " + String.format("%.4f", f));
        System.out.println("змінна типу float = " + Math.round(f));

        System.out.println("\nзмінна типу double = " + d);
        System.out.println("змінна типу double = " + String.format("%.2f", d));
        System.out.println("змінна типу double = " + String.format("%.4f", d));
        System.out.println("змінна типу double = " + Math.round(d));

//        System.out.println("змінна типу boolean = " + b);
//        System.out.println("змінна типу String = " + s);


    }
} // Змінна - місце в пам'яті куди записується інформація.