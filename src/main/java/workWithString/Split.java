package workWithString;

public class Split {
    public static void main(String[] args) {
        String text = "FIFA will never regret it";

        String[] words = text.split(" ");
    }
}
/*
    // 1. split()
        позволяет разбить строку на подстроки по определенному разделителю.
        Разделитель - какой-нибудь символ или набор символов передается в качестве параметра в метод.
        Например, разобьем текст на отдельные слова:
        String text = "FIFA will never regret it";
        String[] words = text.split(" ");
        for(String word : words){
            System.out.println(word);
        }
*/
