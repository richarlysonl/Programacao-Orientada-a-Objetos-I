package atividade2;
public class ContaCorrente {
    int num_conta;
    String cpf;
    String nome;
    int agencia;
    double saldo;
    public void sacar(double valor){
        if((saldo - valor) < 0){
            System.out.println("valor indisponivel");
            return;
        }
        saldo -= valor;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void transferir(int valor, ContaCorrente destino){
        if((saldo - valor) < 0){
            System.out.println("valor indisponivel");
            return;
        }
        saldo -= valor;
        destino.saldo += valor;
    }
}
