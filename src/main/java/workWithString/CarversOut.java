package workWithString;

public class CarversOut {
    public static void main(String[] args) {
        String str = "Hello beautiful world";
        String substr1 = str.substring(6);      // beautiful world
        String substr2 = str.substring(6,15);   // beautiful

        System.out.println("Від індекса 6 і до кінця: \"" + substr1 + "\"");
        System.out.println("Від індекса 6 і до індекса 15: \"" + substr2 + "\"");
    }
}
/*
// Обрезка строки //
    // 2. substring()
        возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса:
        String str = "Hello world";
        String substr1 = str.substring(6); // world
        String substr2 = str.substring(3,5); //lo
*/
