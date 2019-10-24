package timeAndDate;

public class Timer {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();   // фіксується час початку

        for (int i = 0; i < 2000; i++) {
            System.out.print("Yeet...");
        }

        long after = System.currentTimeMillis();    // фіксується час закінчення

        long diff = after - before;                 // підрахунок різниці між закінченням та початком

        System.out.println("\nThe total time is " + diff + " ms");
    }
}