import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String name;
    private List<Cliente> listaClientes;

    public Banco(String name) {
        this.name = name;
        this.listaClientes = new ArrayList();
    }


    public void imprimirClientes() {
        System.out.println("Lista de Clientes:");
        listaClientes.stream().forEach(c -> System.out.println(c.getName() +" : "+c.getCpf()));
    }

    public void adicionarCliente(Cliente cliente) {
        this.listaClientes.add(cliente);
    }


    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
