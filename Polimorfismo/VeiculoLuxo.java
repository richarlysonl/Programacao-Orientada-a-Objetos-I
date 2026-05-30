public class VeiculoLuxo extends Veiculo{
    private int qntdAirbegs;
    private double tamanhoPortaMalas;
    private boolean possuiGps;
    public VeiculoLuxo(String marca, String modelo, String placa, String ano, double valorLocação,double multa, int qntdAirbegs,
            double tamanhoPortaMalas, boolean possuiGps) {
        super(marca, modelo, placa, ano, valorLocação, multa);
        this.qntdAirbegs = qntdAirbegs;
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.possuiGps = possuiGps;
    }
    public int getQntdAirbegs() {
        return qntdAirbegs;
    }
    public void setQntdAirbegs(int qntdAirbegs) {
        this.qntdAirbegs = qntdAirbegs;
    }
    public double getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }
    public void setTamanhoPortaMalas(double tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }
    public boolean isPossuiGps() {
        return possuiGps;
    }
    public void setPossuiGps(boolean possuiGps) {
        this.possuiGps = possuiGps;
    }
    
}
