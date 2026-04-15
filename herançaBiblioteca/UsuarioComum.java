public class UsuarioComum extends Usuario{
    private Emprestimo emprestimo;
    public UsuarioComum(String nome, String telefone, String email, String cpf, Emprestimo emprestimo) {
        super(nome, telefone, email, cpf);
        this.emprestimo = emprestimo;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
    
}
