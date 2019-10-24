package toString;

public class Event {

    // Поля
    private int day;
    private int month;
    private int year;
    private String event;

    // Конструктор
    public Event(int d, int m, int y, String e) {
        this.day = d;
        this.month = m;
        this.year = y;
        this.event = e;
    }

    // Метод toString
    public String toString() {
        return String.format("%d.%d.%d - %s", day, month,year, event);
    }
}