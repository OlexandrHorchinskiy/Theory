package workWithString.Tests;

/*
 * Перетворення стрічки з будь-якими символами в стрічку виключно з цифрами.
 */
public class TransformStringToStringWithOnlyNumbers {
    public static void main(String[] args) {
        String inputData = "654ввчсм3ч24163я5ч2см я  іясм=я55%%;№000/%:с=й8у7к*?";
        String outputData = "";


        // Перетворення стрічки в масив символів.
        char[] inputDataCharArray = inputData.toCharArray();


        // Перетворення масиву char в масив String.
        String[] inputDataStringArray = new String[inputDataCharArray.length];
        for (int i = 0; i < inputDataStringArray.length; i++) {
            inputDataStringArray[i] = Character.toString(inputDataCharArray[i]);
        }


        // Запис в стрічку виключно цифр.
        for (int i = 0; i < inputDataStringArray.length; i++) {
            switch (inputDataStringArray[i]) {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    outputData = outputData.concat(inputDataStringArray[i]);
                    break;
            }
        }


        //
        System.out.println("inputData:  \"" + inputData + "\"");
        System.out.println("outputData: \"" + outputData + "\"");
    }
}