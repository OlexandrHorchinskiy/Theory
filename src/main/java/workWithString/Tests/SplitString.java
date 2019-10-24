package workWithString.Tests;

public class SplitString {
    public static void main(String[] args) {
        // Розділення стрічки на окремі елементи

        String arithmeticExpression = "-5*8-9+10";
        char[] arrayArEx = arithmeticExpression.toCharArray();      // запис масива символів


        String[] arrayInString = new String[arrayArEx.length];      // масив String
        for (int i = 0; i < arrayInString.length; i++) {
            arrayInString[i] = Character.toString(arrayArEx[i]);    // перетворення char в String
        }


        // друк масиву
        for (int i = 0; i < arrayInString.length; i++) {
            System.out.println(arrayInString[i]);
        }
    }
}