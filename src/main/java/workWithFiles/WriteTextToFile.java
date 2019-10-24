package workWithFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteTextToFile {
    public static void main(String[] args) throws FileNotFoundException {
        String fs = File.separator;
        // Створення об'єкта класа "File". Шлях до файла вказувати з кореня проекта
        File file = new File("src" + fs + "main" + fs + "java" + fs + "workWithFiles" + fs + "myFiles" + fs + "textFile");

        // Створення об'єкта класа "File". Якщо файл знаходиться в корені проекта, то достатньо вказати назву файла.
        File newFile = new File("newTextFile");

        // Створення об'єкта класа "PrintWriter"
        PrintWriter pw = new PrintWriter(file);

        // Виклик метода "println()"
        pw.println("Form 1");
        pw.println("Form 2");

        // Закриває об'єкт "pw" класа "PrintWriter"
        pw.close();
    }
}