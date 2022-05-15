package builder;

public class Builder implements EntityBuilder {
    public Builder() {
    }

    public EntityBuilder build(EntityBuilder b) {
        FileBuilder file = new FileBuilder();
        FolderBuilder folder = new FolderBuilder();
        if (b.getClass() == file.getClass()) {
            b = new FileBuilder();
        }
        else if (b.getClass() == folder.getClass()) {
            b = new FolderBuilder();
        }
        else {
            b = new LinkBuilder();
        }
        return b;
    }
}
