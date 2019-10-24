/*
Мета:           Перевірка даних в форматі String на відповідність числу
Вхідні дані:    String
Вихідні дані:   boolean (1. true - String містить число;
                         2. false - String не містить число)
*/
package aaaComponentsForPrograms;

import static java.lang.Character.isDigit;

public class CheckingNumberFromString {
    public static void main(String[] args) {
        String inputData = "421.21"; // TODO: change for final result
        boolean result = isNumber(inputData);
        System.out.println("result: " + result); // TODO: delete for final result
    }


    private static boolean isNumber(String inputData) {
        System.out.println("inputData: " + inputData); // TODO: delete for final result

        boolean answer = false;

        // Перетворення стрічки в масив символів
        char[] arrayInChar = inputData.toCharArray();

        // Перевірка відповідності символів
        int controlSum = 0;
        int coma = 0;
        for (int i = 0; i < arrayInChar.length; i++) {
            if (isDigit(arrayInChar[i])) {
                controlSum++;
            } else if (arrayInChar[i] == '.') {
                controlSum++;
                coma++;
            }
        }
        if (controlSum == arrayInChar.length) {
            answer = true;
        }
        System.out.println("// Перевірка відповідності символів - answer: " + answer); // TODO: delete for final result

        // Перевірка кількості ком
        if (coma > 1) {
            answer = false;
        }
        System.out.println("// Перевірка кількості ком - answer: " + answer); // TODO: delete for final result

        return answer;
    }
}