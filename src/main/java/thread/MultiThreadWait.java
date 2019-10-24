package thread;

import java.util.Scanner;

public class MultiThreadWait {
    public static void main(String[] args) throws InterruptedException {
        // Створюємо поток "thread"
        Scanner input = new Scanner(System.in);
        Thread thread; // Створює об'єкт класу "Thread" (поток)

        thread = new Thread(runnable); // Приймає "runnable" (код який буде виконуватись)
        thread.start(); // Запускає поток "thread"
        System.out.println("main tread очікує завершення таймера");
        thread.join(); // підключення до потоку
        System.out.println("///// таймер " + Thread.currentThread().getName() + " завершено/////\n");

        thread = new Thread(runnable); // Приймає "runnable" (код який буде виконуватись)
        thread.start(); // Запускає поток "thread"
        System.out.println("main tread очікує завершення таймера");
        thread.join(); // підключення до потоку
        System.out.println("///// таймер " + Thread.currentThread().getName() + " завершено/////\n");

        thread = new Thread(runnable); // Приймає "runnable" (код який буде виконуватись)
        thread.start(); // Запускає поток "thread"
        System.out.println("main tread очікує завершення таймера");
        thread.join(); // підключення до потоку
        System.out.println("///// таймер " + Thread.currentThread().getName() + " завершено/////\n");
    }

    static int timeLimit = 3;

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