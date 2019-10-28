package workWithFiles.chooserForFileOrDirectory;

import javax.swing.*;
import java.io.File;

public class FileChooser {
    public File chooseFile() {
        File file;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(0);
        fileChooser.showDialog(null, "Вибрати файл");
        file = fileChooser.getSelectedFile();
        return file;
    }
}