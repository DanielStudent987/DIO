import java.util.List;

import javax.management.RuntimeErrorException;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoas {
    private List<Pessoa> listaPessoa;

    public OrdenacaoPessoas() {
        this.listaPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> ordenarIdade = new ArrayList<>(listaPessoa);
        if (!listaPessoa.isEmpty()) {
          Collections.sort(ordenarIdade);
          return ordenarIdade;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> ordenarAltura = new ArrayList<>(listaPessoa);
        if (!listaPessoa.isEmpty()) {
            Collections.sort(ordenarAltura, new ComparaPessoas());
            return ordenarAltura;
        } else {
            throw new RuntimeException("Lista Vazia..");
        }
        
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenar = new OrdenacaoPessoas();

        ordenar.adicionarPessoa("Daniel", 19, 1.85);
        ordenar.adicionarPessoa("Layane", 20, 1.7);
        ordenar.adicionarPessoa("Kado", 19, 1.7);
        ordenar.adicionarPessoa("Estela", 19, 1.85);
        ordenar.adicionarPessoa("Ifryte", 3, 1.3);
        ordenar.adicionarPessoa("Junior", 25, 1.80);
        ordenar.adicionarPessoa("Bruno", 36, 1.68);
        ordenar.adicionarPessoa("Rafael", 24, 1.9);

        System.out.println(ordenar.ordenarPorIdade());

        System.out.println(ordenar.ordenarPorAltura());
    }
}
