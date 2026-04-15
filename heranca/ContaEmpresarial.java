package heranca;

public class ContaEmpresarial extends Conta{
    private PessoaJuridica cliente;
    private double chequeEspecial;
    public ContaEmpresarial(String agencia, String numConta, String banco, Double saldo, PessoaJuridica cliente,
            double chequeEspecial) {
        super(agencia, numConta, banco, saldo);
        this.cliente = cliente;
        this.chequeEspecial = chequeEspecial;
    }
    public PessoaJuridica getCliente() {
        return cliente;
    }

    public void setCliente(PessoaJuridica cliente) {
        this.cliente = cliente;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }
    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    public boolean sacar(int valor){
        if((getSaldo() - valor) < -chequeEspecial || valor < 0){
            return false;
        }
        setSaldo(getSaldo() - valor);
        return true;
    }
    public boolean depositar(int valor){
        if(valor < 0){
            return false;
        }
        setSaldo(getSaldo() + valor);
        return true;
    }
}