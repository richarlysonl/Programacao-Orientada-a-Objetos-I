public  abstract class Funcionario {
    private String nome;
    private String matricula;
    private double salarioFixo;
    private double bonus;
    private double salarioFinal;
    private double desconto;
    public Funcionario(String nome, String matricula, double salarioFixo) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioFixo = salarioFixo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double getSalarioFixo() {
        return salarioFixo;
    }
    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    public double getBonus() {
        return bonus;
    }
    protected void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getSalarioFinal() {
        return salarioFinal;
    }
    public double getDesconto() {
        return desconto;
    }
    public abstract void calcularBonus(double salarioFixo);
    public void calcularDescontos(double salarioFixo){
        if(this.getClass().getName().equals("Estagiario")){
            this.desconto = 0;
            return;
        }
        this.desconto = (salarioFixo * 0.11) + (salarioFixo * 0.08);
    }
    public void calcularSalarioFinal(){
        this.calcularBonus(this.salarioFixo);
        this.calcularDescontos(this.salarioFixo);
        this.salarioFinal = this.salarioFixo + this.bonus - this.desconto; 
    }
}