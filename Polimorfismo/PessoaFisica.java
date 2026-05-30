public class PessoaFisica extends Cliente{
    private String cpf;
    private Emprestimo emprestimo;
    public PessoaFisica(String nome, String telefone, String endereco, String cpf) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public boolean verificarEmprestimo(){
        if(emprestimo != null){
            return false;
        }
        return true;
    }
}
