package timeAndDate.date;

public class Test {

    public static void main(String args[]) {
        try {
            long start = System.currentTimeMillis();
            System.out.println(new DateTest() + "\n");

            Thread.sleep(1000);

            System.out.println(new DateTest() + "\n");

            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("Разница между датами: " + diff + " миллисекунд");
        } catch (Exception e) {
            System.out.println("Получили исключение!");
        }
    }
}