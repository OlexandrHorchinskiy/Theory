package workWithFiles.chooserForFileOrDirectory;

public class ChooserExample {
    public static void main(String[] args) {

        FileChooser fc = new FileChooser();
        String pathToFile = fc.chooseFile().getPath();
        System.out.println(pathToFile);


        DirectoryChooser dc = new DirectoryChooser();
        String directory = dc.chooseDirectory().getPath();
        System.out.println(directory);

    }
}
