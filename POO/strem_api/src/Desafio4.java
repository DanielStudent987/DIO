import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Desafio4 {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> res = numeros.stream()
        .filter(n1 -> n1%2==0).collect(Collectors.toList());

        res.stream().forEach(System.out::println);


    }
}
