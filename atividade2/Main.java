package atividade2;

public class Main {
    public static void main(String[] args){
        ContaCorrente conta1 = new ContaCorrente();
        conta1.saldo = 400;
        conta1.agencia = 2335;
        conta1.cpf = "111.222.333-00";
        conta1.num_conta = 123456789;
        conta1.nome = "roberto";
        conta1.sacar(200);
        System.out.println("saldo ao sacar "+conta1.saldo);
        conta1.depositar(400);
        System.out.println("saldo ao depositar "+conta1.saldo);
        ContaCorrente conta2 = new ContaCorrente();
        conta2.saldo = 200;
        conta2.agencia = 2335;
        conta2.cpf = "888.999.000-01";
        conta2.num_conta = 123456789;
        conta2.nome = "neymar";
        conta2.sacar(200);
        System.out.println("saldo ao sacar "+conta2.saldo);
        conta2.depositar(400);
        System.out.println("saldo ao depositar "+conta2.saldo);
        conta2.transferir(400, conta1);
        System.out.println("saldo da conta2 ao transferir "+conta2.saldo + " saldo da conta 1 "+conta1.saldo);
    }
}
