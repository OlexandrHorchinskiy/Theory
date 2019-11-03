package workWithFiles.readFromFile;

import workWithFiles.chooserForFileOrDirectory.FileChooser;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        readerExample();
    }


    // Метод для зчитування з файлу
    public static void readerExample() throws FileNotFoundException {
        // Вибір файла.
        FileChooser fc = new FileChooser();
        String pathToFile = fc.chooseFile().getPath();
        /*
        // Вибір файла. Шлях до файлу необхідно вказувати з кореня проекта.
        String fs = File.separator;
        String pathToFile = "src" + fs + "main" + fs + "java" + fs + "workWithFiles" + fs + "fileWriter" + fs + "myFile.txt";
        */

        //Повідомлення про початок зчитування.
        System.out.println("Зчитування з файлу \"" + pathToFile + "\" ...");

        MyFileReader reader = new MyFileReader(pathToFile);
        System.out.println(reader.read());
    }
}