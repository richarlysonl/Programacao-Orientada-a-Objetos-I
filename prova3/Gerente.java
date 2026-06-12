public class Gerente extends Funcionario{
    private double valorFixo;
    public Gerente(String nome, String matricula, double salarioFixo, double valorFixo) {
        super(nome, matricula, salarioFixo);
        this.valorFixo = valorFixo;
    }
    public double getValorFixo() {
        return valorFixo;
    }

    public void setValorFixo(double valorFixo) {
        this.valorFixo = valorFixo;
    }
    @Override
    public void calcularBonus(double salarioFixo) {
        double bonus = ((salarioFixo * 0.2) + this.valorFixo);
        this.setBonus(bonus);
    }
}
