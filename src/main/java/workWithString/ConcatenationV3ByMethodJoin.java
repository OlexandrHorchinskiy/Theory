package workWithString;

public class ConcatenationV3ByMethodJoin {
    public static void main(String[] args) {
        // V.1
        String str1 = "Java";
        String str2 = "Hello";

        String result1 = String.join(" ", str1, str2);

        System.out.println(result1);


        // V.2
        String str3 = "Year";
        int int1 = 2019;

        String result2 = String.join(" ", str3, (String.valueOf(int1)));

        System.out.println(result2);
    }
}
/*
    // 3. Еще один метод объединения - метод join() позволяет объединить строки с учетом разделителя.
        Например, выше две строки сливались в одно слово "HelloJava", но в идеале мы бы хотели,
        чтобы две подстроки были разделены пробелом. И для этого используем метод join():
        String str1 = "Java";
        String str2 = "Hello";
        String str3 = String.join(" ", str2, str1); // Hello Java
        Метод join является статическим. Первым параметром идет разделитель, которым будут разделяться подстроки в общей строке,
        а все последующие параметры передают через запятую произвольный набор объединяемых подстрок - в данном случае две строки,
        хотя их может быть и больше
*/
