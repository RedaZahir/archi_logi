package builder;


import entities.FileImplem;
import org.jetbrains.annotations.NotNull;

public class FileBuilder extends Builder {
    public FileBuilder() {
        FileImplem newFile = new FileImplem();
        this.build(newFile);
    }
    public void build(@NotNull FileImplem fileToBuild) {
            fileToBuild.setName("txtFile01.txt");
            fileToBuild.setContent("This is the "+fileToBuild.getName()+" content.");
    }
}
