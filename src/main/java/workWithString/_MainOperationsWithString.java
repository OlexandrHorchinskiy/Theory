package workWithString;

public class _MainOperationsWithString {
    public static void main(String[] args) {

    }
}


// https://metanit.com/java/tutorial/7.2.php
/* Основные операции со строками

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Соединение строк //+
    // 1. Для соединения строк можно использовать операцию сложения ("+"):
        String str1 = "Java";
        String str2 = "Hello";
        String str3 = str1 + " " + str2;
        System.out.println(str3); // Hello Java

        При этом если в операции сложения строк используется нестроковый объект, например, число,
        то этот объект преобразуется к строке:
        String str3 = "Год " + 2015;
        Фактически же при сложении строк с нестроковыми объектами будет вызываться метод valueOf() класса String.
        Данный метод имеет множество перегрузок и преобразует практически все типы данных к строке.
        Для преобразования объектов различных классов метод valueOf вызывает метод toString() этих классов.


    // 2. Другой способ объединения строк представляет метод concat():
        String str1 = "Java";
        String str2 = "Hello";
        str2 = str2.concat(str1); // HelloJava
        Метод concat() принимает строку, с которой надо объединить вызывающую строку, и возвращает соединенную строку.


    // 3. Еще один метод объединения - метод join() позволяет объединить строки с учетом разделителя.
        Например, выше две строки сливались в одно слово "HelloJava", но в идеале мы бы хотели,
        чтобы две подстроки были разделены пробелом. И для этого используем метод join():
        String str1 = "Java";
        String str2 = "Hello";
        String str3 = String.join(" ", str2, str1); // Hello Java
        Метод join является статическим. Первым параметром идет разделитель, которым будут разделяться подстроки в общей строке,
        а все последующие параметры передают через запятую произвольный набор объединяемых подстрок - в данном случае две строки,
        хотя их может быть и больше


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Разделение строки //+
    // 1. split()
        позволяет разбить строку на подстроки по определенному разделителю.
        Разделитель - какой-нибудь символ или набор символов передается в качестве параметра в метод.
        Например, разобьем текст на отдельные слова:
        String text = "FIFA will never regret it";
        String[] words = text.split(" ");
        for(String word : words){
            System.out.println(word);
        }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Извлечение символов и подстрок //
    // 1. Для извлечения одного символа по индексу в классе String определен метод char charAt(int index).
        Он принимает индекс, по которому надо получить символов, и возвращает извлеченный символ:
        String str = "Java";
        char c = str.charAt(2);
        System.out.println(c); // v
        Как и в массивах индексация начинается с нуля.

    // 2. Если надо извлечь сразу группу символов или подстроку,
        то можно использовать метод getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin).
        Он принимает следующие параметры:
        1. srcBegin: индекс в строке, с которого начинается извлечение символов
        2. srcEnd: индекс в строке, до которого идет извлечение символов
        3. dst: массив символов, в который будут извлекаться символы
        4. dstBegin: индекс в массиве dst, с которого надо добавлять извлеченные из строки символы

        String str = "Hello world!";
        int start = 6;
        int end = 11;
        char[] dst=new char[end - start];
        str.getChars(start, end, dst, 0);
        System.out.println(dst); // world


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Сравнение строк //
    Для сравнения строк используются методы:
    // 1. equals() (с учетом регистра)
    // 2. equalsIgnoreCase() (без учета регистра)
        Оба метода в качестве параметра принимают строку, с которой надо сравнить:
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equalsIgnoreCase(str2)); // true
        В отличие от сравнения числовых и других данных примитивных типов для строк не применяется знак равенства ==.
        Вместо него надо использовать метод equals().

    // 3. regionMatches()
        сравнивает отдельные подстроки в рамках двух строк. Он имеет следующие формы:

        boolean regionMatches(int toffset, String other, int oofset, int len)
        boolean regionMatches(boolean ignoreCase, int toffset, String other, int oofset, int len)
        Метод принимает следующие параметры:
        1. ignoreCase: надо ли игнорировать регистр символов при сравнении. Если значение true, регистр игнорируется
        2. toffset: начальный индекс в вызывающей строке, с которого начнется сравнение
        3. other: строка, с которой сравнивается вызывающая
        4. oofset: начальный индекс в сравниваемой строке, с которого начнется сравнение
        5. len: количество сравниваемых символов в обеих строках

        Используем метод:
        String str1 = "Hello world";
        String str2 = "I work";
        boolean result = str1.regionMatches(6, str2, 2, 3);
        System.out.println(result); // true
        В данном случае метод сравнивает 3 символа с 6-го индекса первой строки ("wor")
        и 3 символа со 2-го индекса второй строки ("wor").
        Так как эти подстроки одинаковы, то возвращается true.

    // 4. int compareTo(String str)
    // 5. int compareToIgnoreCase(String str)
        также позволяют сравнить две строки, но при этом они также позволяют узнать больше ли одна строка, чем другая или нет.
        Если возвращаемое значение больше 0, то первая строка больше второй,
        если меньше нуля, то, наоборот, вторая больше первой.
        Если строки равны, то возвращается 0.

        Для определения больше или меньше одна строка, чем другая, используется лексикографический порядок.
        То есть, например, строка "A" меньше, чем строка "B", так как символ 'A' в алфавите стоит перед символом 'B'.
        Если первые символы строк равны, то в расчет берутся следующие символы. Например:
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hell";
        System.out.println(str1.compareTo(str2)); // -15 - str1 меньше чем strt2
        System.out.println(str1.compareTo(str3)); // 1 - str1 больше чем str3


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Поиск в строке //+
    // 1. indexOf()
        находит индекс первого вхождения подстроки в строку
    // 2. lastIndexOf()
        индекс последнего вхождения.
        Если подстрока не будет найдена, то оба метода возвращают -1:
        String str = "Hello world";
        int index1 = str.indexOf('l'); //2
        int index2 = str.indexOf("wo"); //6
        int index3 = str.lastIndexOf('l'); //9

    // 3. startsWith()
        позволяют определить начинается ли строка с определенной подстроки
    // 4. endsWith()
        позволяет определить заканчивается строка на определенную подстроку:
        String str = "myfile.exe";
        boolean start = str.startsWith("my"); //true
        boolean end = str.endsWith("exe"); //true


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Замена в строке //+
    // 1. replace()
        позволяет заменить в строке одну последовательность символов на другую:
        String str = "Hello world";
        String replStr1 = str.replace('l', 'd'); // Heddo wordd
        String replStr2 = str.replace("Hello", "Bye"); // Bye world


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Обрезка строки //+
    // 1. trim()
        позволяет удалить начальные и конечные пробелы:
        String str = "  hello world  ";
        str = str.trim(); // hello world

    // 2. substring()
        возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса:
        String str = "Hello world";
        String substr1 = str.substring(6); // world
        String substr2 = str.substring(3,5); //lo


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Изменение регистра //
    // 1. toLowerCase()
        переводит все символы строки в нижний регистр
        String str = "Hello World";
        System.out.println(str.toLowerCase()); // hello world

    // 2. toUpperCase()
        переводит все символы строки в верхний регистр
        String str = "Hello World";
        System.out.println(str.toUpperCase()); // HELLO WORLD

*/