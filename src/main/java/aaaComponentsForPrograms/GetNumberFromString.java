/*
Мета:           Виїмка зі String всіх цифр, крапок та ком та перевірка їх на відповідність числу
Вхідні дані:    String
Вихідні дані:   Double (1. число, що містилось в вхідних даних;
                        2. 0, якщо вхідні дані не містили числа)
*/
package aaaComponentsForPrograms;

import java.util.ArrayList;

import static java.lang.Character.isDigit;

public class GetNumberFromString {
    public static void main(String[] args) {
        String inputData = "125s.34"; // TODO: change for final result

        double result = GetNumberFromString(inputData);

        System.out.println("\n/ / / / / / / / / / / / / / / / / / / / / / / / / / / /"); // TODO: delete for final result
        System.out.println("result    : " + result); // TODO: delete for final result
        System.out.println("result * 2: " + result * 2); // TODO: delete for final result

    }


    private static double GetNumberFromString(String inputData) {
        System.out.println("String inputData: \"" + inputData + "\""); // TODO: delete for final result

        // Перетворення стрічки в масив символів
        char[] arrayInChar = inputData.toCharArray();

        // Запис в ArrayList цифр, ком та крапок
        ArrayList<Character> numericCharacters = new ArrayList<>();
        for (int i = 0; i < arrayInChar.length; i++) {
            if (isDigit(arrayInChar[i])) {
                numericCharacters.add(arrayInChar[i]);
            } else if (arrayInChar[i] == '.' || arrayInChar[i] == ',') {
                numericCharacters.add('.');
            }
        }

        // TODO: delete for final result
        // Вивід в консоль "numericCharacters"
        System.out.print("\nArrayList numberSymbols складається з наступних символів: | ");
        for (int i = 0; i < numericCharacters.size(); i++) {
            System.out.print(numericCharacters.get(i) + " | ");
        }


        // Об'єднання символів з "numericCharacters"
        String outputData = "";
        for (int i = 0; i < numericCharacters.size(); i++) {
            outputData += numericCharacters.get(i);
        }
        System.out.println("\noutputData: \"" + outputData + "\""); // TODO: delete for final result


        // Відправка на перевірку та вивід результату
        double doubleFromOutputData;
        if (isNumber(outputData)) {
            doubleFromOutputData = Double.valueOf(outputData);
            System.out.println("outputData: \"" + outputData + "\""); // TODO: delete for final result
            System.out.println("doubleFromOutputData: " + doubleFromOutputData); // TODO: delete for final result
        } else {
            doubleFromOutputData = 0;
            System.out.println("\"" + outputData + "\" не число"); // TODO: delete for final result
        }
        return doubleFromOutputData;
    }


    private static boolean isNumber(String inputData) {
        System.out.println("\nMethod isNumber - START ///////////////////////////////////////////////////////////////"); // TODO: delete for final result
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

        System.out.println("isNumber - answer: " + answer); // TODO: delete for final result
        System.out.println("Method isNumber - END /////////////////////////////////////////////////////////////////\n"); // TODO: delete for final result
        return answer;
    }
}