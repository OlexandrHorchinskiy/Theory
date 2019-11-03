package workWithFiles.writeToFile.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {
    // Шлях до файлу
    private String path;

    // Конструктор
    public MyFileWriter(String path) {
        this.path = path;
    }

    // Метод "write" для запису в файл з параметрами "String text" (дані для запису) та
    // "boolean append" (true - дані записуються після того що вже є в файлі, false - очищує файл та записує нові дані)
    public boolean write(String text, boolean append) throws IOException {
        FileWriter writer = new FileWriter(path, append); // Створює FileWriter "writer", який приймає параметри шлях до файлу (path) та (append)
        writer.write(text); // Записує в буфер
        writer.write("\n- - - - - - - - - - - - - - - - - - - - - \n"); // Записує в буфер
        writer.flush(); // Записує в файл
        writer.close(); // Закриває "writer"
        return true;
    }
}