package zzzDifferent.fromLessons.lesson_8_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    static AtomicInteger atomicX = new AtomicInteger(0);
    static Integer x = 0;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 1000; i ++) {
            threadPool.submit(() -> {
                atomicX.incrementAndGet();
            });
            threadPool.submit(() -> {
                atomicX.decrementAndGet();
            });

            threadPool.submit(() -> {
                x++;
            });
            threadPool.submit(() -> {
                x--;
            });
        }

        Thread.sleep(5000);

        System.out.println("atomicX = " + atomicX);
        System.out.println("x = " + x);

        threadPool.shutdown();
    }
}