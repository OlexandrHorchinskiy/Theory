package workWithFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFileReader {
    // Шлях до файлу
    private String path;

    // Конструктор
    public MyFileReader(String path) {
        this.path = path;
    }

    public String read() throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(path); // FileInputStream "stream", який приймає параметр шлях до файлу (path)
        Scanner scanner = new Scanner(stream);
        scanner.useDelimiter("\\Z"); // "useDelimiter("\\Z")" дає можливість зчитати файл до кінця
        String data = scanner.next(); // Разом з "scanner.useDelimiter("\\Z");" зчитує файл до кінця

//        System.out.println(scanner.nextLine()); // Зчитує наступний рядок з файлу
//        System.out.println(scanner.next()); // Зчитує наступне слово, число чи символ до пропуску
//        String data = "";

        scanner.close(); // Закриває "scanner"

        return data;
    }
}