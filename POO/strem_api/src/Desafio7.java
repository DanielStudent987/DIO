import java.util.Arrays;
import java.util.List;

public class Desafio7 {
    
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int segundo = numeros.stream()
        .distinct()
        .sorted((n1, n2) -> Integer.compare(n2, n1))
        .skip(1)
        .findFirst().get();



        System.out.println("Resultado: " + segundo);
    }
}
