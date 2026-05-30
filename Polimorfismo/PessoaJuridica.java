import java.util.ArrayList;

public class PessoaJuridica extends Cliente{
    private String nomeRepresentante;
    private String cnpj;
    private ArrayList<Emprestimo> emprestimos;
    public PessoaJuridica(String nome, String telefone, String endereco, String nomeRepresentante, String cnpj) {
        super(nome, telefone, endereco);
        this.nomeRepresentante = nomeRepresentante;
        this.cnpj = cnpj;
    }
    public String getNomeRepresentante() {
        return nomeRepresentante;
    }
    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

}
