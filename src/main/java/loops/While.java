package loops;

public class While {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        while (x > y) {
            System.out.println("x = " + x);
            x -= 1;
        }
    }
}

/*
1)	Перевіряється умова циклу (x > y)
        Якщо умова true - виконується тіло циклу
            {
            System.out.println("x = " + x);
            x -= 1;
            }
        Якщо умова false - цикл завершується

2)	Якщо цикл успішно виконавсь, йде перехід знову до перевірки умови циклу
*/