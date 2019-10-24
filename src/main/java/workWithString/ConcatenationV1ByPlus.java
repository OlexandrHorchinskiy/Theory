package workWithString;

public class ConcatenationV1ByPlus {
    public static void main(String[] args) {
        // V.1
        String str1 = "Java";
        String str2 = "Hello";

        String result1 = str1 + " " + str2;

        System.out.println(result1);


        // V.2
        String str3 = "Year";
        int int1 = 2019;

        String result2 = str3 + " " + int1;

        System.out.println(result2);
    }
}
/*
    // 1. Для соединения строк можно использовать операцию сложения ("+"):
    String str1 = "Java";
    String str2 = "Hello";
    String str3 = str1 + " " + str2;
        System.out.println(str3); // Hello Java

                При этом если в операции сложения строк используется нестроковый объект, например, число,
                то этот объект преобразуется к строке:
                String str3 = "Год " + 2019;
                Фактически же при сложении строк с нестроковыми объектами будет вызываться метод valueOf() класса String.
                Данный метод имеет множество перегрузок и преобразует практически все типы данных к строке.
                Для преобразования объектов различных классов метод valueOf вызывает метод toString() этих классов.
*/
