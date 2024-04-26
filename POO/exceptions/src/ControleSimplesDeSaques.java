import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();

// TODO: Crie um loop 'for' para iterar sobre os saques:
        for (int j = 0; j<10; j--) {
// TODO: Solicite ao usuário o valor do saque:
           double saque = scanner.nextDouble();
           double i = 0;
           i += saque;
           
           if (i>=limiteDiario) {
             System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
             j=12;
           } else if (saque==0) {
             System.out.println("Transacoes encerradas.");
             j=12;
           } else {
             limiteDiario -= i;
             System.out.println("Saque realizado. Limite restante:\n" + (limiteDiario));
           }


// TODO: Informe que o saque foi realizado e mostre o limite restante:
              
        }
        

// Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close(); 
    }
}