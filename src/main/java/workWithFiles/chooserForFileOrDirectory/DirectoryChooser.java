package workWithFiles.chooserForFileOrDirectory;

import javax.swing.*;

public class DirectoryChooser {
    public static void main(String[] args) {
        String directory = chooseDirectory();
        System.out.println(directory);
    }


    // Method for choosing directory
    private static String chooseDirectory() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(1);
        fileChooser.showDialog(null, "Вибрати катклог");
        return fileChooser.getSelectedFile().getPath();
    }
}