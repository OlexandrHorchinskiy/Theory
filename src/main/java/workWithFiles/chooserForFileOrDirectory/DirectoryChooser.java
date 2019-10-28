package workWithFiles.chooserForFileOrDirectory;

import javax.swing.*;
import java.io.File;

public class DirectoryChooser {
    public File chooseDirectory() {
        File directory;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(1);
        fileChooser.showDialog(null, "Вибрати катклог");
        directory = fileChooser.getSelectedFile();
        return directory;
    }
}