package workWithString.Tests;

/*
 * Перетворення стрічки в масив символів.
 */
public class StringToCharArray {
    public static void main(String args[]) {
        String inputData = "JAVA a programming language.";


        // Перетворює стрічку в масив символів
        char[] inputDataCharArray = inputData.toCharArray();


        // Вивід масива символів в консоль.
        System.out.print("Стрічка \"" + inputData + "\" складається з наступних символів: ");
        for (int i = 0; i < inputDataCharArray.length; i++) {
            System.out.print(inputDataCharArray[i] + "; ");
        }
    }
}