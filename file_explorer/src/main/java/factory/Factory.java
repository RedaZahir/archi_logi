package factory;

import java.io.File;
import java.util.ArrayList;

public interface Factory {
    ArrayList<File> factory(String name);
}
