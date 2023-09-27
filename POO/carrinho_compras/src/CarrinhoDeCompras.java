import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaCompra;

    public CarrinhoDeCompras () {
        listaCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quant) {
        Item item = new Item(nome, preco, quant);
        listaCompra.add(item);
        
    }

    public void removerItem(String nome) {
        List<Item> removerItem = new ArrayList<>();
        if(!listaCompra.isEmpty()) {

            //PERCORRENDO O CARRINHO
            for (Item item : listaCompra) {
                if (nome.equalsIgnoreCase(item.getNome())) {
                    removerItem.add(item);
                }
            }

            //Removendo os itens do carrinho
            listaCompra.removeAll(removerItem);
        } else {
            System.out.println("Carrinho Vazio!");
        }
        
    }

    public Double calcularValorTotal() {
        if (!listaCompra.isEmpty()) {
            double valorFinal = 0;
            for (Item item : listaCompra) {
                valorFinal += item.getPreco()*item.getQuant();
            }

            return valorFinal;
        } else {
            System.out.println("Lista vazia.");
            return null;
        }
        
    }

    public void exibirItens() {
        if (!listaCompra.isEmpty()) {
            for (Item item : listaCompra) {
                System.out.println(item.getNome()+" - "+item.getPreco()+" - "+item.getQuant());
            }
        } else  {
            System.out.println("Carrinho vazio.");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        carrinho.adicionarItem("danone", 2.5, 10);
        carrinho.adicionarItem("coxinha", 1.5, 5);
        carrinho.adicionarItem("coxinha", 1.5, 15);
        carrinho.adicionarItem("bauru", 3, 5);

        carrinho.exibirItens();
        System.out.println("Total a pagar: "+carrinho.calcularValorTotal()); 

        carrinho.removerItem("coxinha");
        System.out.println("");
        carrinho.exibirItens();
        System.out.println("Total a pagar: "+carrinho.calcularValorTotal()); 
    }
}