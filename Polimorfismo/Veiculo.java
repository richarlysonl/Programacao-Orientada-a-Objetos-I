public abstract class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String ano;
    private double valorLocação;
    private double multa;
    public Veiculo(String marca, String modelo, String placa, String ano, double valorLocação, double multa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.valorLocação = valorLocação;
        this.multa = multa;
    }
    public double devolucaoVeiculo(Emprestimo emprestimo,Veiculo veiculo){
        if(this == veiculo){
            double multa = emprestimo.calcularMulta(veiculo);
            double valor = valorLocação + multa;
            return valor;
        }
        return -1;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public double getValorLocação() {
        return valorLocação;
    }
    public void setValorLocação(double valorLocação) {
        this.valorLocação = valorLocação;
    }
    public double getMulta() {
        return multa;
    }
    public void setMulta(double multa) {
        this.multa = multa;
    }
    
    
}
