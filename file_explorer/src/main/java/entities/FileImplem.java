package entities;


import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class FileImplem implements File {
    public static AtomicInteger id;
    public String name;
    public Double size;
    public String content;

    public FileImplem() {
        this.size = this.setSize();
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

    public Double setSize() {
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
        return "FileImp{" +
                "name='" + name + '\'' +
                ", size=" + size +
                "octets, content=" + content +
                '}';
    }
}
