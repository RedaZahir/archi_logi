package builder;


import entities.FolderImplem;

public class FolderBuilder extends Builder {
    public FolderBuilder() {
        FolderImplem newFolder = new FolderImplem();
        this.build(newFolder);
    }

    public void build(FolderImplem newFolder) {
        for (int i = 0; i < 10; i++) {
            newFolder.setName("newFolder"+i+"");
            newFolder.setContent("This is the " + newFolder.getName() + " content.");
        }
    }
}
