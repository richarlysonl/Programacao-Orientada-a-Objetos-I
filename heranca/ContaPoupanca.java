package heranca;

public class ContaPoupanca extends Conta{
    PessoaFisica cliente;
    public ContaPoupanca(String agencia, String numConta, String banco, Double saldo, PessoaFisica cliente) {
        super(agencia, numConta, banco, saldo);
        this.cliente = cliente;
    }
    public void rendimento(){
        setSaldo(getSaldo() * 1.005);
    }
    public boolean sacar(int valor){
        if(valor < 0){
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
