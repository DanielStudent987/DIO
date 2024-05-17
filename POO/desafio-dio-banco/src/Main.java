import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        //CRIANDO BANCO
        Banco banco = new Banco("Nubank");

        //CRIANDO CLIENTES
        Cliente cl1 = new Cliente("Daniel", 88, "11111111111");
        Cliente cl2 = new Cliente("Kadson", 55, "00000000000");
        banco.adicionarCliente(cl1);
        banco.adicionarCliente(cl2);

        //CRIANDO CONTAS
        Conta cc = new ContaCorrente(0, cl1);
        Conta pou = new ContaPoupanca(0, cl2);

        cc.depositar(1000);
        pou.depositar(1000);

        //IMPRIMINDO EXTRATOS
        cc.imprimirExtrato();
        pou.imprimirExtrato();
        

        cc.transferir(50, pou);
        pou.transferir(500, cc);

        //IMPRIMINDO CLIENTES
        banco.imprimirClientes();
    }
}
