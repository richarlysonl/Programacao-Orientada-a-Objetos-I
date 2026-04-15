import java.util.ArrayList;
class Biblioteca{
    private String nome;
    private String endereco;
    private ArrayList<Publicacao> Publicacoes;
    public Biblioteca(String nome, String endereco, ArrayList<Publicacao> publicacoes) {
        this.nome = nome;
        this.endereco = endereco;
        Publicacoes = publicacoes;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public ArrayList<Publicacao> getPublicacoes() {
        return Publicacoes;
    }
    public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
        Publicacoes = publicacoes;
    }
    
}