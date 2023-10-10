import java.util.HashSet;
import java.util.Set;

import javax.management.RuntimeErrorException;

public class ConjuntoConvidados {
    private Set<Convidado> conjunto;

    public ConjuntoConvidados() {
        this.conjunto = new HashSet<>();
    }

    @Override
    public String toString () {
        return "Conjunto {"+
                        "Convidado: "+ conjunto+
                        "}";
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        conjunto.add(new Convidado(nome, codigoConvite));
        System.out.println("Convidado Adicionado!");
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {

        if (!conjunto.isEmpty()) {
            for (Convidado c:conjunto) {
                if (c.getCodigo()==codigoConvite) {
                    conjunto.remove(c);
                    break;
                }
            }
        } else {
            throw new RuntimeException("Conjunto Vazio.");
        }
    }

    public int contarConvidados() {
        return conjunto.size();
       
    }

    public Set<Convidado> exibirConvidados() {
        if (!conjunto.isEmpty()) {
            return conjunto;
        } else {
            throw new RuntimeException("Conjunto Vazio.");
        }
    }


    


    public static void main(String[] args) {
        ConjuntoConvidados objeto = new ConjuntoConvidados();

        objeto.adicionarConvidado("Daniel R.", 01);
        objeto.adicionarConvidado("Junior", 02);
        objeto.adicionarConvidado("Cabral", 03);
        objeto.adicionarConvidado("Ramalho", 04);
     
        
        System.out.println(objeto.contarConvidados());
        System.out.println(objeto.exibirConvidados());
        objeto.removerConvidadoPorCodigoConvite(2);

        System.out.println(objeto.contarConvidados());
        System.out.println(objeto.exibirConvidados());
    }
}
