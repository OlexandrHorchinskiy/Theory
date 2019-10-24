package thread.Sync;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Synchronized {
//    private Scanner input = new Scanner(System.in);
//    private int sem = input.nextInt();

    static Semaphore semaphore = new Semaphore(1);

    static void writeInDataBase() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " очікуємо semaphore");
        semaphore.acquire();
        System.out.println(Thread.currentThread().getName() + " semaphore отримано");

        System.out.println(Thread.currentThread().getName() + " Write in data base...");
        Thread.sleep(500);

        System.out.println(Thread.currentThread().getName() + " вивільняється semaphore");
        semaphore.release();
        System.out.println(Thread.currentThread().getName() + " semaphore вивільнено");
    }// код для виконання потоком


    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        writeInDataBase(); // код для виконання потоком
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            System.out.println(Thread.currentThread().getName() + " поток створено " + i);
        }

    }
}