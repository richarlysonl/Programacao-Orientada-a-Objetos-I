public class VeiculoPopular extends Veiculo{
    private boolean temArCondicionado;
    
    public VeiculoPopular(String marca, String modelo, String placa, String ano, double valorLocação, double multa,
            boolean temArCondicionado) {
        super(marca, modelo, placa, ano, valorLocação, multa);
        this.temArCondicionado = temArCondicionado;
    }
    public boolean isTemArCondicionado() {
        return temArCondicionado;
    }
    public void setTemArCondicionado(boolean temArCondicionado) {
        this.temArCondicionado = temArCondicionado;
    }
}
