import java.util.ArrayList;

public class LocadoraVeiculos{
    private String nome;
    private String enereco;
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Emprestimo> emprestimos;
    public LocadoraVeiculos(String nome, String enereco, ArrayList<Veiculo> veiculos) {
        this.nome = nome;
        this.enereco = enereco;
        this.veiculos = veiculos;
    }
    public LocadoraVeiculos(String nome, String enereco) {
        this.nome = nome;
        this.enereco = enereco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEnereco() {
        return enereco;
    }
    public void setEnereco(String enereco) {
        this.enereco = enereco;
    }
    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }
    public void addVeiculo(Veiculo Veiculo){
        this.veiculos.add(Veiculo);
        return;
    }
    public void removeVeiculo(Veiculo Veiculo){
        this.veiculos.remove(Veiculo);
        return;
    }
    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
        return;
    }
    public void removeCliente(Cliente cliente){
        this.clientes.remove(cliente);
        return;
    }
    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
    public void addEmprestimo(Emprestimo emprestimo){
        this.emprestimos.add(emprestimo);
        return;
    }
    public void removeemprestimo(Emprestimo emprestimo){
        this.emprestimos.remove(emprestimo);
        return;
    }
    
}
