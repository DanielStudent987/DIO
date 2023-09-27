import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaTarefas {
    private List<Tarefa> tarefas;

    public ListaTarefas () {
        this.tarefas = new ArrayList();
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList();
        if (!tarefas.isEmpty()) {
            for (Tarefa t : tarefas) {
                
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasParaRemover.add(t);
                    
                }
            }

            tarefas.removeAll(tarefasParaRemover);
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public int obterNumeroTotalTarefas() {
        return tarefas.size();
    }

    public void obterDescricoesTarefas() {
        if (!tarefas.isEmpty()) {
            System.out.println(tarefas);
        } else {
            System.out.println("Não há tarefas");
        }
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        ListaTarefas listaTarefa = new ListaTarefas();

        String desc;
        while (true) {
            System.out.println("Escreva uma descrição para sua lista de tarefas(\"sair\" para fechar programa e \"imprimir\"):");
            desc = t.nextLine();


            if (desc.equalsIgnoreCase("sair")) {
                break;
            }

            listaTarefa.adicionarTarefa(desc);
        }
        
        System.out.println("Escreva uma descricao que queira retirar");
        desc = t.nextLine();

        listaTarefa.removerTarefa(desc);
        
        listaTarefa.obterDescricoesTarefas();

        
    }
   
}
