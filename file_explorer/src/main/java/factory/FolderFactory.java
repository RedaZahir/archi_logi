package factory;

import java.io.File;
import java.util.ArrayList;

public class FolderFactory extends Creator {
    public FolderFactory() {
        this.factory("newFolder");
    }
    @Override
    public ArrayList<File> factory(String name) {
        ArrayList<File> files;
        File path = new File("/ressources/files/");
        files = showFiles(path.listFiles());
        return files;
    }

    public static ArrayList<File> showFiles(File[] files) {
        ArrayList<File> filesList = new ArrayList<>();
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("Directory: " + file.getAbsolutePath());
                // showFiles(file.listFiles()); // Calls same method again.
            } else {
                filesList.add(file);
            }
        }
        return filesList;
    }
}
