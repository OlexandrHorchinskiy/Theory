/*
Мета:           Позбавлення тексту зайвих пробілів (заміна двох і більше пробілів на один)
Вхідні дані:    String
Вихідні дані:   String
*/

package aaaComponentsForPrograms;

import java.util.ArrayList;

public class RemovingExtraSpacesFromText {
    public static void main(String[] args) {
        String inputData = "Java one of the  most popular programing   language!  Year  2019."; // TODO: change for final result
        System.out.println("Вхідна  стрічка: \"" + inputData + "\""); // TODO: delete for final result
        String outputData = removingExtraSpacesInText(inputData);
        System.out.println("Вихідна стрічка: \"" + outputData + "\""); // TODO: delete for final result
    }


    private static String removingExtraSpacesInText(String inputData) {
        String output = "";
        ArrayList<String> textWithoutExtraSpaces = new ArrayList<>();
        char[] arrayInChar = inputData.toCharArray(); // Перетворення стрічки в масив символів

        textWithoutExtraSpaces.add(String.valueOf(arrayInChar[0]));
        output = String.valueOf(arrayInChar[0]);
        for (int i = 1; i < arrayInChar.length; i++) {
            if (arrayInChar[i] == ' ' && String.valueOf(arrayInChar[i]).equals(textWithoutExtraSpaces.get(textWithoutExtraSpaces.size() - 1))) {
                System.out.println("* зайвий пробіл видалено *"); // TODO: delete for final result
            } else {
                textWithoutExtraSpaces.add(String.valueOf(arrayInChar[i]));
                output = String.join("", output, String.valueOf(arrayInChar[i]));
            }
        }

        return output;
    }
}