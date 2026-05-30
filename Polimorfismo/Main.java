import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocadoraVeiculos locadora =new LocadoraVeiculos("Ferrad", "Rua X");
        int opc = -1;
        while (opc != 0) {
            System.out.println("\n1 - Registrar veículo");
            System.out.println("2 - Registrar cliente");
            System.out.println("3 - Registrar empréstimo");
            System.out.println("4 - Cancelar empréstimo");
            System.out.println("0 - Sair");
            opc = scanner.nextInt();
            scanner.nextLine();
            if (opc == 1) {
                System.out.println("Digite o tipo:");
                System.out.println("popular | SUV | luxo");
                String tipo = scanner.nextLine();
                System.out.print("Marca: ");
                String marca = scanner.nextLine();
                System.out.print("Modelo: ");
                String modelo = scanner.nextLine();
                System.out.print("Placa: ");
                String placa = scanner.nextLine();
                System.out.print("Ano: ");
                String ano = scanner.nextLine();
                System.out.print("Valor locação: ");
                double valorLocacao = scanner.nextDouble();
                System.out.print("Valor multa: ");
                double multa = scanner.nextDouble();
                scanner.nextLine();
                switch (tipo) {
                    case "popular":
                        System.out.print("Tem ar condicionado? ");
                        boolean ar = scanner.nextBoolean();
                        Veiculo carro1 =new VeiculoPopular(marca,modelo,placa,ano,valorLocacao,multa,ar);
                        locadora.addVeiculo(carro1);
                        break;
                    case "SUV":
                        System.out.print("Tamanho porta malas: ");
                        double tamanhoPortaMala = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Tração: ");
                        String tracao = scanner.nextLine();
                        System.out.print("Combustível: ");
                        String combustivel = scanner.nextLine();
                        Veiculo carro2 = new VeiculoSUV(marca,modelo,placa,ano,valorLocacao,multa,tamanhoPortaMala,tracao,combustivel);
                        locadora.addVeiculo(carro2);
                        break;
                    case "luxo":
                        System.out.print("Quantidade airbags: ");
                        int airbags = scanner.nextInt();

                        System.out.print("Tamanho porta malas: ");
                        double portaMala = scanner.nextDouble();

                        System.out.print("Tem GPS integrado? ");
                        boolean gps = scanner.nextBoolean();

                        Veiculo carro3 = new VeiculoLuxo(marca,modelo,placa,ano,valorLocacao,multa,airbags,portaMala,gps);
                        locadora.addVeiculo(carro3);
                        break;
                    default:
                        System.out.println("Tipo inválido");
                }
            }
            else if (opc == 2) {
                System.out.println("1 - Pessoa Física");
                System.out.println("2 - Pessoa Jurídica");
                int tipoCliente = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();
                System.out.print("Endereço: ");
                String endereco = scanner.nextLine();
                if (tipoCliente == 1) {
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                     Cliente cliente = new PessoaFisica(nome,telefone,endereco,cpf);
                    locadora.addCliente(cliente);
                } else {
                    System.out.print("CNPJ: ");
                    String cnpj = scanner.nextLine();
                    System.out.print("Representante: ");
                    String representante =
                            scanner.nextLine();
                    Cliente cliente = new PessoaJuridica(nome,telefone,endereco,cnpj,representante);
                    locadora.addCliente(cliente);
                }
            }
else if(opc == 3){
    System.out.println("clientes:");
    for(int i = 0; i < locadora.getClientes().size(); i++){
        System.out.println(i + " - " + locadora.getClientes().get(i));
    }
    System.out.print("escolha o cliente");
    int clienteIndex = scanner.nextInt();
    System.out.println("veiculos:");
    for(int i = 0; i < locadora.getVeiculos().size(); i++){
        System.out.println(i + " - " + locadora.getVeiculos().get(i));
    }
    System.out.print("escolha o veiculo");
    int veiculoIndex = scanner.nextInt();

    Cliente cliente = locadora.getClientes().get(clienteIndex);

    Veiculo veiculo = locadora.getVeiculos().get(veiculoIndex);

    System.out.print("numero de renovacoes");
    int renovacoes = scanner.nextInt();

    if(cliente instanceof PessoaFisica){
        Emprestimo emprestimo = new Emprestimo((PessoaFisica)cliente,veiculo,renovacoes,veiculo.getMulta());
        locadora.addEmprestimo(emprestimo);
    }else if(cliente instanceof PessoaJuridica){
        Emprestimo emprestimo = new Emprestimo((PessoaJuridica)cliente,veiculo,renovacoes);
        locadora.addEmprestimo(emprestimo);
    }
    System.out.println("emprestimo realizado");
}
else if(opc == 4){
    System.out.println("emprestimos:");
    for(int i = 0; i < locadora.getEmprestimos().size(); i++){
        System.out.println(i + " - " + locadora.getEmprestimos().get(i));
    }
    System.out.print("escolha o emprestimo");
    int empIndex = scanner.nextInt();
    Emprestimo emprestimo = locadora.getEmprestimos().get(empIndex);
    Veiculo veiculo = emprestimo.getVeiculo();
    double valorFinal = veiculo.devolucaoVeiculo(emprestimo,veiculo);
    System.out.println("valor total " + valorFinal);
    locadora.getEmprestimos().remove(empIndex);
    System.out.println("emprestimo finalizado");
}
        }
    }
}