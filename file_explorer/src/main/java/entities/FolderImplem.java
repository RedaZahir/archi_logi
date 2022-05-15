package entities;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class FolderImplem implements Folder {
    public static AtomicInteger id;
    public String name;
    public Double size;
    public String content;

    public FolderImplem() {
        this.size = this.computeSum();
    }

    public AtomicInteger getId() {
        return id;
    }

    public static String createID()
    {
        return String.valueOf(id.getAndIncrement());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSize() {
        return size;
    }

    public Double computeSum() {
        Double rangeMin = Double.valueOf(2);
        Double rangeMax = Double.valueOf(20);
        Random r = new Random();
        double value = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        return value;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String describe() {
        return "FolderImplem{" +
                "name='" + name + '\'' +
                ", size=" + size +
                " octets, content='" + content + '\'' +
                '}';
    }
}
