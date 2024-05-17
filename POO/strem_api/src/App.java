import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3 ,4, 5);

        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        //PRIMEIRO MODO SEM LAMBDA
        int res = numeros.stream()
        .reduce(0 ,
            new BinaryOperator<Integer>() {

                @Override
                public Integer apply(Integer num1, Integer num2) {
                    // TODO Auto-generated method stub
                    return num1+num2;
                }}
                
        );

        //COM LAMBDA
        res = numeros.stream()
        .reduce(0, (n1, n2) -> n1+n2);

        System.out.println("Resultado da soma: " + ((int) res));
    }
}
