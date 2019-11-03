package workWithFiles.writeToFile.fileWriter;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        writerExample();
    }


    // Метод для запису в файл
    public static void writerExample() throws IOException {
        // Вибір файла. Шлях до файлу необхідно вказувати з кореня проекта.
        String fs = File.separator;
        String pathToFile = "src" + fs + "main" + fs + "java" + fs + "workWithFiles" + fs + "writeToFile" + fs + "myFile.txt";
        System.out.println("Запис в файл \"" + pathToFile + "\" ...");

        // Дані для запису.
        String dataForWriting = "house-3" +
                                "\ntree-3" +
                                "\ntrain-3";

        // Параметр "append".
        boolean append = true; // Дописує дані після тих, що є в файлі.
//        boolean append = false; // Очищує файл від даних та записує нові.

        // Запис.
        boolean isWrite;
        MyFileWriter writer = new MyFileWriter(pathToFile);
        isWrite = writer.write(dataForWriting, append);

        // Повідомлення про завершення запису.
        if (isWrite) {
            System.out.println("Запис в файл \"" + pathToFile + "\" завершено.");
        } else {
            System.out.println("Запис в файл \"" + pathToFile + "\" не відбувся.");
        }
    }
}