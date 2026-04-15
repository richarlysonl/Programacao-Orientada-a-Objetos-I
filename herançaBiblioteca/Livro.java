import java.util.ArrayList;
public class Livro extends Publicacao{
    private ArrayList<Autor> autores;
    private String numEdicao;
    private String nomeEditora;
    private String isbn;
    public Livro(String data, String titulo, ArrayList<Publicacao> publicacoesVinculadas, double valorMulta,
            ArrayList<Autor> autores, String numEdicao, String nomeEditora, String isbn) {
        super(data, titulo, publicacoesVinculadas, valorMulta);
        this.autores = autores;
        this.numEdicao = numEdicao;
        this.nomeEditora = nomeEditora;
        this.isbn = isbn;
    }
    public ArrayList<Autor> getAutores() {
        return autores;
    }
    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }
    public String getNumEdicao() {
        return numEdicao;
    }
    public void setNumEdicao(String numEdicao) {
        this.numEdicao = numEdicao;
    }
    public String getNomeEditora() {
        return nomeEditora;
    }
    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
