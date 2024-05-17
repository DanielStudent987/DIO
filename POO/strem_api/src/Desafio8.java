import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Desafio8 {
    
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
       
        int somadigitos = numeros.stream().map(numero -> {
            int soma = 0;
            while (numero != 0) {
                soma += numero % 10;
                numero /= 10;
            }
            return soma;
        }).mapToInt(Integer::intValue).sum();
        
        System.out.println("Soma eh: "+somadigitos);

        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElse("Default"); 
        System.out.println(result);
    }
}
