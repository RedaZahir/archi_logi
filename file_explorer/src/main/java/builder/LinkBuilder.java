package builder;

import entities.LinkImplem;
import org.jetbrains.annotations.NotNull;

public class LinkBuilder extends Builder {
    public LinkBuilder() {
        LinkImplem newLink = new LinkImplem();
        this.build(newLink);
    }
    public void build(@NotNull LinkImplem newLink) {
        newLink.setName("Link01");
        newLink.setPath("This is the "+newLink.getName()+" path.");
    }
}
