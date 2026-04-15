import java.util.ArrayList;
public class Artigo extends Publicacao {
    private ArrayList<Autor> autores;
    private String resumo;
    public Artigo(String data, String titulo, ArrayList<Publicacao> publicacoesVinculadas, double valorMulta,
            ArrayList<Autor> autores, String resumo) {
        super(data, titulo, publicacoesVinculadas, valorMulta);
        this.autores = autores;
        this.resumo = resumo;
    }
    public ArrayList<Autor> getAutores() {
        return autores;
    }
    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }
    public String getResumo() {
        return resumo;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    
}
