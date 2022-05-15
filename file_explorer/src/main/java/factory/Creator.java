package factory;



import java.io.File;
import java.util.ArrayList;

public class Creator implements Factory {
    public Creator() {

    }
    @Override
    public ArrayList<File> factory(String n){
        ArrayList<File> f = new ArrayList<>();
        f.add(new File("/ressources/files/"));
        return f;
    }
    public Factory create(Factory f) {
        FileFactory file = new FileFactory();
        FolderFactory folder = new FolderFactory();
        if (f.getClass() == file.getClass()) {
            f = new FileFactory();
        }
        else if (f.getClass() == folder.getClass()) {
            f = new FolderFactory();
        }
        else {
            f = new LinkFactory();
        }
        return f;
    }
}
