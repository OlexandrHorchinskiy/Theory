package workWithString.Tests;

/*
* Перетворює стрічку в масив символів та виводить масив символів в консоль
*/
public class StringToCharArray {
    public static void main(String args[]) {
        String str = "JAVA a programming language.";

        // Перетворює стрічку в масив символів
        char[] strToArray = str.toCharArray();

        // Вивід масива в консоль
        System.out.print("Фраза \"" + str + "\" складається з наступних символів: ");
        for (int i = 0; i < strToArray.length; i++) {
            System.out.print(strToArray[i] + "; ");
        }
    }
}