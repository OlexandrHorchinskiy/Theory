package timeAndDate;

public class Timer {
    public static void main(String[] args) {

        timer();

    }


    private static void timer() {
        long startTime = System.currentTimeMillis();    // фіксується час початку
        action();
        long finishTime = System.currentTimeMillis();   // фіксується час закінчення
        long difference = finishTime - startTime;       // підрахунок різниці між закінченням та початком
        System.out.println("\nThe total time is " + difference + " ms");
    }


    private static void action() {
        for (int i = 0; i < 2000; i++) {
            System.out.print("Yeet..." + i + " ");
        }
    }
}