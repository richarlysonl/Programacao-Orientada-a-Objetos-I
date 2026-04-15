package biblioteca;
import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<Livro>();
    public ArrayList<Livro> getLivros() {
        return livros;
    }
    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }
    public void removerLivro(Livro livro){
        livros.remove(livro);
    }
    
}
