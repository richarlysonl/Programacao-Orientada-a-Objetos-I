package heranca;
public class ContaCorrente extends Conta{
    private PessoaFisica cliente;
    public ContaCorrente(String agencia, String numConta, String banco, Double saldo) {
        super(agencia, numConta, banco, saldo);
    }
    public PessoaFisica getcliente() {
        return cliente;
    }
    public void setcliente(PessoaFisica cliente) {
        this.cliente = cliente;
    }
    public boolean sacar(int valor){
        if((getSaldo() - valor) < 0 || valor < 0){
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