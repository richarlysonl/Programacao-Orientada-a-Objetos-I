public class Engenheiro extends Funcionario{
    private int qntdProjetos;
    
    public Engenheiro(String nome, String matricula, double salarioFixo, int qntdProjetos) {
        super(nome, matricula, salarioFixo);
        this.qntdProjetos = qntdProjetos;
    }
    public int getQntdProjetos() {
        return qntdProjetos;
    }
    public void setQntdProjetos(int qntdProjetos) {
        this.qntdProjetos = qntdProjetos;
    }
    @Override
    public void calcularBonus(double salarioFixo) {
        double bonus = (salarioFixo * 0.10) + (1000 * qntdProjetos);
        this.setBonus(bonus);
    }
}
