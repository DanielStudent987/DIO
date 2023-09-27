import java.util.Comparator;

public class Box implements Comparator<Box> {
    private String name;
    private int isbn;

    public Box (String name, int isbn) {
        this.name = name;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public int compare(Box b1, Box b2) {
        return b1.getName().compareTo(b2.getName());
    }
    
}
