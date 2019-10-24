package workWithString;

public class SearchingV2Boolean {
    public static void main(String[] args) {
        String str = "myfile.exe";
        boolean start = str.startsWith("my");  //true
        boolean end = str.endsWith("pdf");     //false

        System.out.println("Чи починається \"" + str + "\" з \"my\"? Відповідь: " + start);
        System.out.println("Чи закінчується \"" + str + "\" на \"pdf\"? Відповідь: " + end);
    }
}
/*
// Поиск в строке //
    // 3. startsWith()
        позволяют определить начинается ли строка с определенной подстроки
    // 4. endsWith()
        позволяет определить заканчивается строка на определенную подстроку:
        String str = "myfile.exe";
        boolean start = str.startsWith("my"); //true
        boolean end = str.endsWith("exe"); //true
*/
