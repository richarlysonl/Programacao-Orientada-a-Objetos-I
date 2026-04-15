import java.util.ArrayList;
public abstract class  Publicacao {
    private String data;
    private String titulo;
    private ArrayList<Publicacao> publicacoesVinculadas;
    private double valorMulta;
    private boolean emEmprestimo;
    public Publicacao(String data, String titulo, ArrayList<Publicacao> publicacoesVinculadas,
         double valorMulta) {
        this.data = data;
        this.titulo = titulo;
        this.publicacoesVinculadas = publicacoesVinculadas;
        this.valorMulta = valorMulta;
        this.emEmprestimo = false;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public ArrayList<Publicacao> getPublicacoesVinculadas() {
        return publicacoesVinculadas;
    }
    public void setPublicacoesVinculadas(ArrayList<Publicacao> publicacoesVinculadas) {
        this.publicacoesVinculadas = publicacoesVinculadas;
    }
    public double getValorMulta() {
        return valorMulta;
    }
    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }
    public boolean isEmEmprestimo() {
        return emEmprestimo;
    }
    public void setEmEmprestimo(boolean emEmprestimo) {
        this.emEmprestimo = emEmprestimo;
    }
}
