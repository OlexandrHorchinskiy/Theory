package thread;

import java.util.concurrent.*;

public class Runnable_Callable {
    private static double result;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);

        int[] array = new int[80000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        ////////// * Runnable * ////////// певертає дані з потоку в main через глобальну змінну
        long beforeRunnable = System.currentTimeMillis();   // фіксується час початку
        Runnable run = new Runnable() {
            @Override
            public void run() {
                result = calculation(array); // для передачі дани
            }
        };
        Future futureRunnable = service.submit(run);
        futureRunnable.get(); // задопомогою future.get() очікуємо завершення виконання задачі run
        System.out.println("Результат (Runnable) = " + result);
        System.out.println("Час на виконання Runnable " + ( System.currentTimeMillis() - beforeRunnable ) + " ms\n");




        ////////// * Callable * ////////// певертає дані з потоку в main
        long beforeCallable = System.currentTimeMillis();   // фіксується час початку
        Callable<Double> call = new Callable<Double>() {
            @Override
            public Double call() throws Exception {
                return calculation(array);
            }
        };
        Future<Double> futureCallable = service.submit(call);
        System.out.println("Результат (Callable) = " + futureCallable.get());
        System.out.println("Час на виконання Callable " + ( System.currentTimeMillis() - beforeCallable ) + " ms");

        service.shutdown();
    }


    // Method for calculation
    private static double calculation(int[] array) {
        double sumOfResults = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfResults += Math.sin(array[i]) + Math.cos(array[i]);
        }
        return sumOfResults;
    }

}