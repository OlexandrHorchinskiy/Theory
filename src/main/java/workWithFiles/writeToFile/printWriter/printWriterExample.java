package workWithFiles.writeToFile.printWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class printWriterExample {
    public static void main(String[] args) throws FileNotFoundException {
        String fs = File.separator;
        // Шлях до файлу (необхідно вказувати з кореня проекта, якщо файл знаходиться в корені проекта, то достатньо вказати назву файла).
        String pathToFile = "src" + fs + "main" + fs + "java" + fs + "workWithFiles" + fs + "printWriter" + fs + "textFile";

        // Дані для запису.
        String dataForWriting_1 = "Form X";
        Integer dataForWriting_2 = 255;
        Double dataForWriting_3 = 1.65;

        // Створення об'єкта класа "File".
        File file = new File(pathToFile);
        System.out.println("Чи існує файл \"" + pathToFile + " \" - " + file.exists());

        // Створення об'єкта класа "PrintWriter"
        PrintWriter pw = new PrintWriter(file);

        // Виклик метода "println()"
        pw.println(dataForWriting_1);
        pw.println(dataForWriting_2);
        pw.println(dataForWriting_3);

        // Закриває об'єкт "pw" класа "PrintWriter"
        pw.close();
    }
}