package toString;

public class Calendar {
    public static void main(String[] args) {

        // Створює об'єкт "е" класу "Event" зі значеннями
        Event e = new Event(24, 8 , 1991,"День Незалежності");


        /*
        * Виводить в консоль об'єкт "е"
        * Для виводу в консоль автоматично шукається та викликається метод "toString" з класу "Event",
        * щоб в текстовому форматі вивести інформацію об'єкта "е" в консоль в потрібному форматі
        */
        System.out.println(e);
        System.out.println(e.toString());
    }
}
