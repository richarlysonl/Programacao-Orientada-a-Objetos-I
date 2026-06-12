import java.util.LinkedList;
public class Rh {
    private LinkedList<Funcionario> funcionarios;
    public Rh(LinkedList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    public Rh() {
    }

    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }
    public void removeFuncionario(Funcionario funcionario){
        this.funcionarios.remove(funcionario);
    }
    public double calcularFolhaPagamento(){
        double folhaPagamento = 0;
        for(int i=0;i< this.funcionarios.size()-1;i++){
            Funcionario funcionario = funcionarios.get(i);
            folhaPagamento += funcionario.getSalarioFinal();
        }
        return folhaPagamento;
    }
}
