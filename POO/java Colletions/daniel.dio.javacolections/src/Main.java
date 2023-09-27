import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Box box1 = new Box("aanael", 1);
        Box box2 = new Box("banael", 2);

        System.out.println(box1.compare(box1, box2));

        List<String> generica = new ArrayList<>();
        generica.add("oi");
        generica.add("ai");

        for (String elm : generica) {
            System.out.println(elm);
        }

        
    }
}
