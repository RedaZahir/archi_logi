package entities;

public class LinkImplem implements Link {
    public String name;
    public String path;

    public LinkImplem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String describe() {
        return "LinkImplem{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
