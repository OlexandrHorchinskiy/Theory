package zzzDifferent.devideTextToParts;
/*
* This code divide long text "S" to smaller parts by length "K".
* */
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Text for dividing.
        String S = "You have a long piece of text, and you want to send it to your friend as a series of SMS messages. " +
                "Your text consists of English letters (uppercase and lowercase) and spaces. " +
                "The text doesn't contain any leading spaces at the beginning or trailing spaces at the end. " +
                "There are no two consecutive spaces in the text. " +
                "One proper SMS can contain at most K characters. If the text is longer, it needs to be split into parts.";

        // Length of smaller parts.
        int K = 60;

        divideText(S, K);
    }


    private static void divideText(String text, int K) {
        String[] words = text.split(" ");
        String message = "";
        String messageTemp;
        ArrayList<String> messages = new ArrayList<>();


        for (int index = 0; index < words.length; index++) {
            messageTemp = ( message + " " + words[index] ).trim();
            int lengthMessageTemp = messageTemp.length();

            if (words[index].length() > K) {
                index = words.length - 1;
                messages.clear();
                System.out.println("Text cannot be divided into " + K + "-character lengths parts!");

            } else {
                if (lengthMessageTemp == K) {
                    messages.add(messageTemp);
                    message = "";

                } else if (lengthMessageTemp < K) {
                    if (index == ( words.length - 1 )) {
                        messages.add(messageTemp);

                    } else {
                        message = messageTemp;
                    }

                } else if (lengthMessageTemp > K) {
                    if (index == ( words.length - 1 )) {
                        messages.add(message);
                        messages.add(words[index]);

                    } else {
                        messages.add(message);
                        message = words[index];
                    }
                }
            }
        }


        if (messages.size() != 0) {
            printArrayList(messages);
            System.out.println("\n" + messages);
        }
    }


    private static void printArrayList(ArrayList<String> list) {
        System.out.println("Всі повідомлення: ");
        for (String SMS : list) {
            System.out.println("\tlength=" + SMS.length() + "\t | \"" + SMS + "\"");
        }
    }
}