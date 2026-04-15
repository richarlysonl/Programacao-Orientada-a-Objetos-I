public class Emprestimo {
    private Usuario usuario;
    private Publicacao publicacao;
    private int numRenovacoes;
    private double valorMultaTotal = 0;
    public Emprestimo(Usuario usuario, Publicacao publicacao, int numRenovacoes) {
        this.usuario = usuario;
        this.publicacao = publicacao;
        publicacao.setEmEmprestimo(true);
        this.numRenovacoes = numRenovacoes;
        this.valorMultaTotal = 0;
    }
    public void renovarEmprestimo(Emprestimo emprestimo){
        emprestimo.numRenovacoes++;
        if(emprestimo.numRenovacoes > 3){
            emprestimo.valorMultaTotal += publicacao.getValorMulta();
        }
    }
    public void pagarMulta(){
        this.valorMultaTotal = 0;
    }
    public void fimEmprestimo (Emprestimo emprestimo){
        publicacao.setEmEmprestimo(false);
        if(valorMultaTotal == 0){
        emprestimo = null;
        return;
        }
        else{
        pagarMulta();
        emprestimo = null;
        }
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Publicacao getPublicacao() {
        return publicacao;
    }
    public void setPublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }
    public int getNumRenovacoes() {
        return numRenovacoes;
    }
    public void setNumRenovacoes(int numRenovacoes) {
        this.numRenovacoes = numRenovacoes;
    }
    public double getValorMultaTotal() {
        return valorMultaTotal;
    }
    public void setValorMultaTotal(double valorMultaTotal) {
        this.valorMultaTotal = valorMultaTotal;
    }
    
}
