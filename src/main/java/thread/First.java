package thread;

public class First {

    final static long mainThreadId = Thread.currentThread().getId();

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                synchronized (System.out) {
                    System.out.println("Thread name = " + Thread.currentThread().getName());
                    System.out.println("Thread id = " + Thread.currentThread().getId());
                    System.out.println("Thread is main = " + isThreadMain(Thread.currentThread()) + "\n");
                }
            }
        };

        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();

        runnable.run();
    }


    private static boolean isThreadMain(Thread thread) {
        if (thread.getId() == mainThreadId) return true;
        return false;
    }
}