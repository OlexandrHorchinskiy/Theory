package thread;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    private static Semaphore semaphore;
    private static Object lock = new Object();

    public static void personRunnable() {

        System.out.println(Thread.currentThread().getName() + ": Пришел ко входу в библиотеку");

        System.out.println(Thread.currentThread().getName() + ": подошел к двери с улицы");

        if (semaphore.availablePermits() < 1) {
            System.out.println(Thread.currentThread().getName() + ": Ждет входа в библиотеку ");
        }
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + ": проходит через дверь внутрь ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": прошел через дверь внутрь ");
            System.out.println(Thread.currentThread().getName() + ": Вошел в библиотеку ");
        }
//        try {
//            semaphore.acquire();
//            System.out.println(Thread.currentThread().getName() + ": Вошел в библиотеку ");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println(Thread.currentThread().getName() + ": Читает книгу ");
        try {
            int sec = new Random().nextInt(5);
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ": подошел к двери изнутри");
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + ": проходит через дверь наружу");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": прошел через дверь наружу");
        }
        System.out.println(Thread.currentThread().getName() + ": Вышел из библиотеки ");
        semaphore.release();


    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите количесто людей");
        int peopleCount = scanner.nextInt();
        System.out.println("Введите макс количество людей в библиотеке");
        int maxAmount = scanner.nextInt();

        ExecutorService service = Executors.newFixedThreadPool(peopleCount, new PersonThreadFactory());

        semaphore = new Semaphore(maxAmount);


        for (int i = 0; i < peopleCount; i++) {
            Thread thread = new Thread("Person" + i + 1);
            service.submit(() -> {
                personRunnable();
                //System.out.println(Thread.currentThread().getName()   +  " ");
            });
        }


        service.shutdown();


    }

    private static class PersonThreadFactory implements ThreadFactory {
        AtomicInteger atomicInteger = new AtomicInteger(1);

        public Thread newThread(Runnable r) {
            return new Thread(r, "Person " + atomicInteger.getAndIncrement());
        }
    }
}