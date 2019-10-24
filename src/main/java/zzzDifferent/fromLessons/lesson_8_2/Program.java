package zzzDifferent.fromLessons.lesson_8_2;

import java.util.concurrent.*;

/*
    Пул потоков
    Runnable, Callable, Future
    FutureTask
    Atomic types
    Livelock
    Http Get request
 */

public class Program {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Runnable runnable;
        Callable<Integer> callable;
        Future<Integer> future = new Future<Integer>() {
            @Override
            public boolean cancel(boolean mayInterruptIfRunning) {
                return false;
            }

            @Override
            public boolean isCancelled() {
                return false;
            }

            @Override
            public boolean isDone() {
                return false;
            }

            @Override
            public Integer get() throws InterruptedException, ExecutionException {
                return null;
            }

            @Override
            public Integer get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
                return null;
            }
        };

        // Callable ----------------------------------------------

        Callable<Integer> callable1 = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1000;
            }
        };

        // FutureTask --------------------------------------------
        FutureTask<Integer> futureTask = new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                // считаем
                Thread.sleep(1000);
                return 1000;
            }
        });

        new Thread(futureTask).start();

        int result = 0;
        try {
            result = futureTask.get(100, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            // e.printStackTrace();
            futureTask.cancel(true);
        }
        System.out.println("Result: " + result);
    }






//    private  static void temp() {
//        ExecutorService threadPool = Executors.newFixedThreadPool(8);
//        FutureTask task = new FutureTask<String>(new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                return null;
//            }
//        });
//        threadPool.submit(task);
//        threadPool.shutdown();
//    }
}