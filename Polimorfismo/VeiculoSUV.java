public class VeiculoSUV extends Veiculo{
    private double tamanhoPortaMala;
    private String tracao;
    private String combustivel;
    public VeiculoSUV(String marca, String modelo, String placa, String ano, double valorLocação, double multa,
            double tamanhoPortaMala, String tracao, String combustivel) {
        super(marca, modelo, placa, ano, valorLocação, multa);
        this.tamanhoPortaMala = tamanhoPortaMala;
        this.tracao = tracao;
        this.combustivel = combustivel;
    }
    public double getTamanhoPortaMala() {
        return tamanhoPortaMala;
    }
    public void setTamanhoPortaMala(double tamanhoPortaMala) {
        this.tamanhoPortaMala = tamanhoPortaMala;
    }
    public String getTracao() {
        return tracao;
    }
    public void setTracao(String tracao) {
        tracao = this.tracao;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    
}
