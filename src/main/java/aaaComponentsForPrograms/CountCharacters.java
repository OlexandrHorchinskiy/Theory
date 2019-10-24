package aaaComponentsForPrograms;

public class CountCharacters {
    public static void main(String[] args) {
        String inputText = "Java is a programming language";
        String charToCount = "a";

        System.out.println(countSpaces(inputText, charToCount) + " characters \"" + charToCount + "\""
                + " are available in text \"" + inputText + "\"");
    }

    private static int countSpaces(String text, String charToCount) {
        int numberOfChar = text.length() - text.replace(charToCount, "").length();
        return numberOfChar;
    }
}