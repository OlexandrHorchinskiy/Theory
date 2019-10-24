package loops;

public class DoWhile {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        do {
            System.out.println("x = " + x);
            x -= 1;
        } while (x > y);
    }
}

/*
В циклі do ... while тіло циклу гарантовано виконується один раз.
1)	Виконується тіло циклу
            {
            System.out.println("x = " + x);
            x -= 1;
            }

2)	Перевіряється умова (x > y)
        Якщо умова true - цикл виконується знову
        Якщо умова false - цикл завершується
*/