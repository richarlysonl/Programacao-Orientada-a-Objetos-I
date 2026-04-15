package biblioteca;

public class Livro {
    private String titulo;
    private String autores;
    private String anoPublicacao;
    private String isbn;
    private boolean disponivel;
    public Livro(String titulo,String autores, String anoPublicacao, String isbn){
        this.titulo = titulo;
        this.autores = autores;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
        disponivel = true;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getautores() {
        return autores;
    }
    public void setautores(String autores) {
        this.autores = autores;
    }
    public String getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public boolean getDisponivel() {
        return disponivel;
    }
    public Boolean emprestimo(){
        if(getDisponivel()){
        disponivel = false;
        return true;
    }
    return false;
    }
    public void devolucao(){
        disponivel = true;
    }
}
