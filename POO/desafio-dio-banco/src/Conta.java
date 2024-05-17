public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;


    public Conta(double saldo, Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        if (this.saldo>=valor && valor>0) {
            saldo -= valor;
            System.out.println("Saldo Atual: "+getSaldo()+"\n");
        } else {
            throw new RuntimeException("Saldo Insuficiente."+"\n");
        }
    }

    public void depositar (double valor) {
        if (valor>0) {
            this.saldo += valor;
            System.out.println("Saldo Atual: "+getSaldo()+"\n");
        } else {
            throw new RuntimeException("Valor Invalido."+"\n");
        }
    }

    //METODO  
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        imprimirExtrato();
    }

    public void imprimirExtrato() {
        System.out.println("===Extrato da Conta===");
        System.out.println("Nome: "+getCliente().getName());
        System.out.println("Agencia: "+getAgencia());
        System.out.println("Numero: "+getNumero());
        System.out.println("Saldo: "+getSaldo()+"\n");
    }


    //GETTERS AND SETTERS
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
