package heranca;

public class Conta {
    private String agencia;
    private String numConta;
    private String banco;
    private Double saldo;
    public Conta(String agencia, String numConta, String banco, Double saldo) {
        this.agencia = agencia;
        this.numConta = numConta;
        this.banco = banco;
        this.saldo = saldo;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNumConta() {
        return numConta;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
}