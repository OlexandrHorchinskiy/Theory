package workWithString;

public class DeletingSpacesAtBeginingAndEnd {
    public static void main(String[] args) {
        String str1 = "  hello world  ";
        String str2 = str1.trim(); // hello world

        System.out.println("До видалення пропусків: \"" + str1 + "\"");
        System.out.println("Після видалення пропусків: \"" + str2 + "\"");
    }
}
/*
// Обрезка строки //
    // 1. trim()
        позволяет удалить начальные и конечные пробелы:
        String str = "  hello world  ";
        str = str.trim(); // hello world
*/
