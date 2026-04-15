import java.util.ArrayList;

public class tese extends Publicacao{
    private Autor autor;
    private int numPaginas;
    private String resumo;
    private String dataDefesa;
    private String instituição;
    public tese(String data, String titulo, ArrayList<Publicacao> publicacoesVinculadas, double valorMulta, Autor autor,
            int numPaginas, String resumo, String dataDefesa, String instituição) {
        super(data, titulo, publicacoesVinculadas, valorMulta);
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.resumo = resumo;
        this.dataDefesa = dataDefesa;
        this.instituição = instituição;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public int getNumPaginas() {
        return numPaginas;
    }
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    public String getResumo() {
        return resumo;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    public String getDataDefesa() {
        return dataDefesa;
    }
    public void setDataDefesa(String dataDefesa) {
        this.dataDefesa = dataDefesa;
    }
    public String getInstituição() {
        return instituição;
    }
    public void setInstituição(String instituição) {
        this.instituição = instituição;
    }
    
}
