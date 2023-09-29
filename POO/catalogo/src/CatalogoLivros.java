import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    private List<Livro> listaLivro;

    public CatalogoLivros() {
        this.listaLivro = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        listaLivro.add(livro);
    }

    public String pesquisarPorAutor(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();
        if (!listaLivro.isEmpty()) {
            for (Livro livro:listaLivro) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(livro);
                }
            }
            return livroPorAutor.toString();
        } else {
            return "Catalogo Vazio.";
        }
        
    }

    public String pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livroPorAno = new ArrayList<>();
        if (!listaLivro.isEmpty()) {
            for (Livro livro:listaLivro) {
                if ((livro.getAnoPublicacao()>=anoInicial) && (livro.getAnoPublicacao()<=anoFinal)) {
                    livroPorAno.add(livro);
                }
            }
            //RETORNADO LISTA DE LIVRO POR ANO DE PUBLICAÇÃO
            return livroPorAno.toString();
        } else {
            return "Catalogo Vazio.";
        }
    }

    public Livro pesquisarPorTitulo(String titulo) {
        
        if (!listaLivro.isEmpty()) {
            Livro livroAutor = null;
            for (Livro livro:listaLivro) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroAutor = livro;
                    break;
                }            
            }
            //RETORNA O PRIMEIRO LIVRO SELECIONADO
            return livroAutor;
        } else {
            throw new RuntimeException("Catalogo Vazio.");
        }
    }

    @Override
    public String toString() {
        return "Catalogo {" +
                    " Livros: " + listaLivro+ 
                        "}";
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("As Cronicas de Agua e Fogo", "Martin", 1960);
        catalogo.adicionarLivro("Hora de Aventura", "Jake", 2015);
        catalogo.adicionarLivro("Estela e suas Artimanhas", "Layane", 2019);
        catalogo.adicionarLivro("Eh Pegadinha po", "Layane", 2019);
        catalogo.adicionarLivro("Age", "Layane", 2018);
        catalogo.adicionarLivro("Age", "Layane", 2017);
        catalogo.adicionarLivro("Uma Vingança pelo Odio", "Undefiened", 2023);

        System.out.println(catalogo.pesquisarPorAutor("layane"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2020, 2025));
        System.out.println(catalogo.pesquisarPorTitulo("Age"));
    }
}
