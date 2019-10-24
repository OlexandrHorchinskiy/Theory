package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class Parallel {
    public static void main(String[] args) throws java.lang.Exception {
        new Parallel().test();
    }


    class Worker implements Callable<Integer> {
        private int n;

        Worker(int n) {
            this.n = n;
        }

        public Integer call() throws Exception {
            int sum = 0;
            for (int i = 0; i < n; i++)
                sum += i + 1;
            return sum;
        }
    }


    public void test() throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        int num = 100;
        List<Worker> tasks = new ArrayList(100);
        for (int i = 0; i < num; i++)
            tasks.add(new Worker(i));
        List<Future<Integer>> results = executor.invokeAll(tasks);
        for (Future<Integer> result : results)
            System.out.println(result.get());

    }

}