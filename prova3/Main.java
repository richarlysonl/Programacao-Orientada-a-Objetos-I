public class Main {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente("messi", "123sfd", 1000, 100);
        Funcionario e1 = new Engenheiro("cr7", "134fdsag", 1200, 8);
        Funcionario estagiario = new Estagiario("ney", "123sf", 600, 5);
        
        System.out.println("bonus: ");
        g1.calcularBonus(g1.getSalarioFixo());
        System.out.println(g1.getBonus());
        e1.calcularBonus(e1.getSalarioFixo());
        System.out.println(e1.getBonus());
        estagiario.calcularBonus(estagiario.getSalarioFixo());
        System.out.println(estagiario.getBonus());

        System.out.println("descontos: ");
        g1.calcularDescontos(g1.getSalarioFixo());
        System.out.println(g1.getDesconto());
        e1.calcularDescontos(e1.getSalarioFixo());
        System.out.println(e1.getDesconto());
        estagiario.calcularDescontos(estagiario.getSalarioFixo());
        System.out.println(estagiario.getDesconto());

        Rh rh = new Rh();
        rh.addFuncionario(e1);
        rh.addFuncionario(g1);
        rh.addFuncionario(estagiario);
        double folhaPagamento = rh.calcularFolhaPagamento();
        System.out.println("folha de pagamento: ");
        System.out.println(folhaPagamento);
    }
}
