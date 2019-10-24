package workWithString;

public class ConcatenationV2ByMethodConcat {
    public static void main(String[] args) {
        // V.1
        String str1 = "Java";
        String str2 = "Hello";

        String result1 = str1.concat(" ").concat(str2);

        System.out.println(result1);


        // V.2
        String str3 = "Year";
        int int1 = 2019;

        String result2 = str3.concat(" ").concat(String.valueOf(int1));

        System.out.println(result2);
    }
}
/*
    // 2. Другой способ объединения строк представляет метод concat():
        String str1 = "Java";
        String str2 = "Hello";
        str2 = str2.concat(str1); // HelloJava
        Метод concat() принимает строку, с которой надо объединить вызывающую строку, и возвращает соединенную строку.
*/
