public class StringToNumber {
    public static void main(String[] args) {
        String inputData = "025,";
        String outputData;

//        outputData = inputData.replace(',', ' ');
//        outputData = outputData.trim();
        outputData = inputData.replace(',', ' ').trim();

        System.out.println("inputData:  \"" + inputData + "\"");
        System.out.println("outputData: \"" + outputData + "\"");


//        // Визначення довжини числа
//        System.out.println("Вхідні дані: " + inputData);
//
//        char[] inputDataArray = inputData.toCharArray();      // запис масива символів
//
//        String[] inputDataArrayInString = new String[inputDataArray.length];      // масив String
//        for (int i = 0; i < inputDataArrayInString.length; i++) {
//            inputDataArrayInString[i] = Character.toString(inputDataArray[i]);    // перетворення char в String
//        }
//
//        int part;
//        int outputData = 0;
//        for (int i = 0; i < inputDataArray.length; i++) {
//            part = Character.getNumericValue(inputDataArray[i]);
//            if (part.){
//
//            }
//        }
//
//        System.out.println("outputData: " + outputData);
//
//
//        // друк масиву
//        for (int i = 0; i < inputDataArrayInString.length; i++) {
//            System.out.println(inputDataArrayInString[i]);
//        }
    }
}