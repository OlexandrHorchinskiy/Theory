package serialization;
// Дорозібратися!
// https://www.youtube.com/watch?v=PcwXTCWRGvY
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DataObject dataObject = new DataObject();
        String fs = File.separator;
        File file = new File("src" + fs + "main" + fs + "java" + fs + "serialization" + fs + "store.bin");
        System.out.println("file path: " + file.getPath());

        // запис в файл
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(dataObject);
        objectOutputStream.flush();
        objectOutputStream.close();


        // читання з фала
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        DataObject dataObjectNew = (DataObject) objectInputStream.readObject();
        objectInputStream.close();


        // друк об'єкта
        System.out.println(dataObjectNew.toString());
    }
}
