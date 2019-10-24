package workWithFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyFileMain {
    public static void main(String[] args) throws IOException {
        writerExample();
        readerExample();
    }


    // Метод для запису в файл
    public static void writerExample() throws IOException {
        System.out.println(" * Метод для запису в файл * ");

        String fs = File.separator;
        // Шлях до файлу необхідно вказувати з кореня проекта
        String pathToFile = "src" + fs + "main" + fs + "java" + fs + "workWithFiles" + fs + "myFiles" + fs + "myFile";

        MyFileWriter writer = new MyFileWriter(pathToFile);
        writer.write("\tОчищує файл та записує нові дані"
                + "\nhouse-2\ntree-2\ntrain-2\n", false);
        writer.write("\n\tДописує дані після тих, що є в файлі"
                + "\ngreen house\nold tree\npassenger train", true);
    }


    // Метод для зчитування з файлу
    public static void readerExample() throws FileNotFoundException {
        System.out.println(" * Метод для зчитування з файлу * ");

        String fs = File.separator;
        // Шлях до файлу необхідно вказувати з кореня проекта
        String pathToFile = "src" + fs + "main" + fs + "java" + fs + "workWithFiles" + fs + "myFiles" + fs + "myFile";

        MyFileReader reader = new MyFileReader(pathToFile);
        System.out.println(reader.read());
    }
}