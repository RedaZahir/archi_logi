package factory;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;
import entities.FileImplem;

public class FileFactory extends Creator {
    public FileFactory() {
        this.factory("newFile");
        ArrayList<String> nameList = this.getNames();
        for (int i=0; i<10; i++) {
            FileImplem file = new FileImplem();
        }
    }
    @Override
    public ArrayList<File> factory(String name) {
        ArrayList<File> files = new ArrayList<>();
        return files;
    }
    public ArrayList<String> getNames() {
        ArrayList<String> nameList = new ArrayList<>();
        try (Stream<Path> paths = Files.walk(Paths.get("/ressources/files/"))) {
            paths
                    .filter(Files::isRegularFile)
                    .forEach(System.out::println);
        nameList.add(paths.toString());} catch (IOException e) {
            e.printStackTrace();
        }
        return nameList;
    }
}
