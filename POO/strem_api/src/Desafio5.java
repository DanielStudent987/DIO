import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Desafio5 {
    
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Double media = numeros.stream()
        .filter(n1 -> n1>5).mapToDouble(Integer::doubleValue).average().getAsDouble();

        System.out.println("Resultado "+ (media));
    }
}
