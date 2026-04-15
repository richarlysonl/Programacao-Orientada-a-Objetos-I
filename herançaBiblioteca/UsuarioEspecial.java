import java.util.ArrayList;
public class UsuarioEspecial extends Usuario{
    private ArrayList<Emprestimo> emprestimos;
    public UsuarioEspecial(String nome, String telefone, String email, String cpf, ArrayList<Emprestimo> emprestimos) {
        super(nome, telefone, email, cpf);
        this.emprestimos = emprestimos;
    }
    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
    
}
