package workWithString;

public class SearchingV1Index {
    public static void main(String[] args) {
        String str = "HELLO WORLD";
        int index1 = str.indexOf('L');          // 2
        int index2 = str.indexOf("WO");         // 6
        int index3 = str.lastIndexOf('L');  // 9

        System.out.println("перший раз \"L\" зустрічається під індексом " + index1);
        System.out.println("перший раз перший символ з \"WO\" зустрічається під індексом " + index2);
        System.out.println("останній раз \"L\" зустрічається під індексом " + index3);
    }
}
/*
// Поиск в строке //
    // 1. indexOf()
        находит индекс первого вхождения подстроки в строку
    // 2. lastIndexOf()
        индекс последнего вхождения.
        Если подстрока не будет найдена, то оба метода возвращают -1:
        String str = "Hello world";
        int index1 = str.indexOf('l'); //2
        int index2 = str.indexOf("wo"); //6
        int index3 = str.lastIndexOf('l'); //9
*/
