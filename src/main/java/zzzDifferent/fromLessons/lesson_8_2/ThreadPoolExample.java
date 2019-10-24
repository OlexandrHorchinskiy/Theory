package zzzDifferent.fromLessons.lesson_8_2;

import java.util.concurrent.*;

public class ThreadPoolExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(8);

        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(300);
                return 1000;
            }
        };

        Future<Integer> future = threadPool.submit(callable);
        FutureTask<Integer> futureTask = new FutureTask<Integer>(callable);
        threadPool.submit(futureTask);

        System.out.println("Задачи поставленны на выполнение: " + System.currentTimeMillis());

        System.out.println("Callable Value: " + future.get() + " \t\t\t" + System.currentTimeMillis());
        System.out.println("FutureTask Value: " + futureTask.get() + " \t\t\t" + System.currentTimeMillis());

        threadPool.shutdown();
    }
}