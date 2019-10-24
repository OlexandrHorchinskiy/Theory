/*
https://metanit.com/java/tutorial/2.18.php
https://www.youtube.com/watch?v=yFbEdO94tzs
Перевантаження методів (method overloading) - це механізм, який дає можливість використовувати
одну назву для методів з різними типами та/або з різною кількістю параметрів (змінних).
*/
package methods;

public class OverloadingMethod {
    public static void main(String[] args) {
        System.out.println("Сума двох int = "     + sum(2, 3));                // 5
        System.out.println("Сума двох double = "  + sum(4.5, 3.2));            // 7.7
        System.out.println("Сума трьох int = "    + sum(4, 3, 7));          // 14
        System.out.println("Сума трьох double = " + sum(4.5, 3.2, 1.2));    // 8.9
        System.out.println("Сума двох String = \"" + sum("Hello", "world!") + "\"");     // Hello world
        String[] words = {"Hello", "beautiful", "world!"};
        System.out.println("Сума масиву = \"" + sum(words) + "\"");
    }

    private static int sum(int x, int y) {
        return x + y;
    }

    private static double sum(double x, double y) {
        return x + y;
    }

    private static int sum(int x, int y, int z) {
        return x + y + z;
    }

    private static double sum(double x, double y, double z) {
        return x + y + z;
    }

    private static String sum(String x, String y) {
        return x + " " + y;
    }

    private static String sum(String[] words) {
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                result += words[i];
            } else {
                result += " " + words[i];
            }
        }
        return result;
    }
}