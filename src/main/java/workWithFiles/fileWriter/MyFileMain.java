package workWithFiles.fileWriter;

import workWithFiles.chooserForFileOrDirectory.FileChooser;

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
        // Вибір файла. Шлях до файлу необхідно вказувати з кореня проекта.
        String fs = File.separator;
        String pathToFile = "src" + fs + "main" + fs + "java" + fs + "workWithFiles" + fs + "fileWriter" + fs + "myFile.txt";

        //Повідомлення про початок запису. DEL!
        System.out.println("Запис в файл \"" + pathToFile + "\" ..."); // Повідомлення.

        // Дані для запису.
        String dataForWriting = "\nhouse-1\ntree-1\ntrain-1\n";

        // Параметр "append".
        boolean append = true; // Дописує дані після тих, що є в файлі.
//        boolean append = false; // Очищує файл від даних та записує нові.

        // Запис.
        boolean isWrite;
        MyFileWriter writer = new MyFileWriter(pathToFile);
        isWrite = writer.write(dataForWriting, append);

        // Повідомлення про завершення запису. DEL!
        if (isWrite) {
            System.out.println("Запис в файл \"" + pathToFile + "\" завершено.");
        } else {
            System.out.println("Запис в файл \"" + pathToFile + "\" не відбувся.");
        }
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

        //Повідомлення про початок зчитування. DEL!
        System.out.println("Зчитування з файлу \"" + pathToFile + "\" ..."); // Повідомлення.

        MyFileReader reader = new MyFileReader(pathToFile);
        System.out.println(reader.read());
    }
}