/*
Мета:           Поділ стрічки на окремі слова розділені пробілами
Вхідні дані:    String
Вихідні дані:   String[]
*/

package aaaComponentsForPrograms;

public class SplitStringIntoSeparateParts {
    public static void main(String[] args) {
        String inputData = "Java one of the most popular programing     language. 4 55555.5 -777 +0.8 9"; // TODO: change for final result
        System.out.println("Вхідна стрічка: \"" + inputData + "\""); // TODO: delete for final result

        // Розділення рядка тексту та поміщення його в масив (елемент масиву це текст що відділений від іншого тексту в рядку пробілом)
        String[] strArray = inputData.split("[ ]");

        // Вивід масива в консоль
        System.out.println("\nМасив окремих слів (елементів) стрічки: ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println("\"" + strArray[i] + "\"");
        }
    }
}