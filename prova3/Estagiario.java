public class Estagiario extends Funcionario{
    private int mesesTrabalhados;
    public Estagiario(String nome, String matricula, double salarioFixo, int mesesTrabalhados) {
        super(nome, matricula, salarioFixo);
        this.mesesTrabalhados = mesesTrabalhados;
    }
    public int getMesesTrabalhados() {
        return mesesTrabalhados;
    }
    public void setMesesTrabalhados(int mesesTrabalhados) {
        this.mesesTrabalhados = mesesTrabalhados;
    }
    @Override
    public void calcularBonus(double salarioFixo) {
        if(mesesTrabalhados > 24){
            double bonus = (salarioFixo* (0.01 * 24));
            this.setBonus(bonus);
        }else{
            double bonus = (salarioFixo* (0.01 * mesesTrabalhados));
            this.setBonus(bonus);
    }
    }
}
