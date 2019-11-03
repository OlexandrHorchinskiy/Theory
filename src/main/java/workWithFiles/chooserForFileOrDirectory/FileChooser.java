package workWithFiles.chooserForFileOrDirectory;

import javax.swing.*;
import java.io.File;

public class FileChooser {
    public static void main(String[] args) {
        String pathToFile = chooseFile().getPath();
        System.out.println(pathToFile);
    }


    // Method for choosing file.
    public static File chooseFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(0);
        fileChooser.showDialog(null, "Вибрати файл");
        return fileChooser.getSelectedFile();
    }
}