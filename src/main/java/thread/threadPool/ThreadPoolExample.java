package thread.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(4); //

        for (int i = 0; i < 20; i++) {
            int finalI = i;
            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " - Hello! - " + finalI);
                }
            }); // threadPool обробляє задачу
        }

        threadPool.shutdown();
    }
}