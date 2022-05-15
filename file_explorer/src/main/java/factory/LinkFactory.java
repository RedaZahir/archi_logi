package factory;


import entities.LinkImplem;

import java.io.File;
import java.util.ArrayList;

public class LinkFactory extends Creator {
    public LinkFactory() {
        LinkImplem link = new LinkImplem();
        link.setPath("/ressources/files");
    }
    @Override
    public ArrayList<File> factory(String name) {
        String path = name;
        ArrayList<File> file = new ArrayList<>();
        File p = new File("/ressources/");
        file.add(p);
        return file;
    }

}
