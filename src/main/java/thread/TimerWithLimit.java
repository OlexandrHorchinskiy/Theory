package thread;

import java.util.Scanner;

public class TimerWithLimit {
    public static void main(String[] args) throws InterruptedException {
        // Створюємо поток "thread"
        Scanner input = new Scanner (System.in);
        Thread thread; // Створює об'єкт класу "Thread" (поток)

        timeLimit = input.nextInt();
        thread = new Thread(runnable); // Приймає "runnable" (код який буде виконуватись)
        thread.start(); // Запускає поток "thread"

        timeLimit = input.nextInt();
        thread = new Thread(runnable); // Приймає "runnable" (код який буде виконуватись)
        thread.start(); // Запускає поток "thread"

        timeLimit = input.nextInt();
        thread = new Thread(runnable); // Приймає "runnable" (код який буде виконуватись)
        thread.start(); // Запускає поток "thread"
    }

    static int timeLimit = 0;

    static Runnable runnable = new Runnable() { // Створює об'єкт інтерфейса в якому э один абстрактний метод "run"
        @Override // Перевизначає метод "run"
        public void run() {
            int seconds = 0;

            while (seconds < timeLimit) {
                try {
                    seconds++;
                    Thread.sleep(1000); // Поток засинає на 1 секунду
                    System.out.println("поток " + Thread.currentThread().getName() + " секунд " + seconds);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        } // В методі "run" знаходиться необхідний для виконання код
    };

}