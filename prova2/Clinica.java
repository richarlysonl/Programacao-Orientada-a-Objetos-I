import java.util.LinkedList;
public class Clinica {
    private String nome;
    private String endereco;
    private String numRegistro;
    private String cnpj;
    private LinkedList<Funcionario> funcionarios;
    public Clinica(String nome, String endereco, String numRegistro, String cnpj,
            LinkedList<Funcionario> funcionarios) {
        this.nome = nome;
        this.endereco = endereco;
        this.numRegistro = numRegistro;
        this.cnpj = cnpj;
        this.funcionarios = funcionarios;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNumRegistro() {
        return numRegistro;
    }
    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public LinkedList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(LinkedList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    public void addPlanoDeSaude(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }
    public void removePlanoDeSaude(Funcionario funcionario){
        this.funcionarios.remove(funcionario);
    }
}
