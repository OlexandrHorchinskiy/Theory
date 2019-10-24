package consol;


public class Printf {
    public static void main(String[] args) {
        String s1 = "Car";
        String s2 = "Tree";

        int i1 = 4;
        int i2 = 321;
        int i3 = i1 * i2;

        double d1 = 1.2345;
        double d2 = 5.4321;

        // "%" це вказівник формату даних. Кількість вказівників повинно відповідати кількості аргументів.

        // "%s" - String
        // "%S" - String (всі літери великі)
        // "%d" - число
        // "%f" - число з плаваючою точкою
        // "%.2f" - заокруглити до сотих
        // "%с" - символ типу char
        // "%b" - значення типу boolean (true або false)
        // "%e" - експотенціальний запис числа (6,023224e23)

        // "%10s" - String (рядок має не менше 10-ти символів, якщо s1 менше, тоді зліва додаються пропуски)
        // "\n" або "%n" - з нового рядка
        // "\t" - табуляція
        // "%%" - символ відсотка

        System.out.printf("%d\n", i1);
        System.out.printf("%.2f\n", d2);
        System.out.printf("%d %.2f\n", i1, d2);
//
//        System.out.printf("\t%s\n", s1);
//        System.out.printf("%S\n", s1);
//        System.out.printf("%10s\n", s1);
//        System.out.printf("%s, %s\n", s1, s2);
//
//        System.out.printf("\n%d\n", i1);
//        System.out.printf("%d * %d = %d\n", i1, i2, i3);
//        System.out.printf("%7d\n%7d\n%7d\n", i1, i2, i3);
//
//
//        System.out.printf("\n%f\n", d1);
//        System.out.printf("%.2f\n", d1);

    }
}
//http://microsin.net/programming/arm/secrets-of-printf.html

/*
Для простоты текста заменил System.out.Printf() на Printf().

Базовые конструкции.
%s → String или toString().

Printf("Hello %s!", "World"); //  "Hello World!"
%n → Перенос строки.

Byte, Short, Int, Long.
%d → В десятеричном.
%x → В шестнадцатеричном.

%7d → В десятеричном. Минимальная ширина строки 7 знаков.

Printf("%7d", 1); //  "      1"

%07d → Минимальная ширина строки 7 знаков. Начало забить нулями.

Printf("%07d", 1); //  "0000001"


Float, Double.
%f → Десятичное  число с точкой.
%e → Десятичное  число с точкой и экспонентой.

%.10f → С точностью 10 знаков после запятой.

Printf("%.10f", Math.PI); //  "3,1415926536"


DateTest, Calendar.
%tF → Дата в формате "год-месяц-день".

Printf("%tF", new DateTest()); //  "2011-01-27"
%tT → Время в формате "час:минута:секунда".

Printf("%tT", new DateTest()); //  "22:42:37"

*/