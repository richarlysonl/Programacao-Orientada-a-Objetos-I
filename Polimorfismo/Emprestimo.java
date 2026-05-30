public class Emprestimo {
    private Cliente cliente;
    private Veiculo veiculo;
    private int numRenovacoes;
    private int limiteRenovacoesGratis;
    public Emprestimo(PessoaFisica cliente, Veiculo veiculo, int numRenovacoes,double multa) {
        if(cliente.verificarEmprestimo()){
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.numRenovacoes = numRenovacoes;
        this.limiteRenovacoesGratis = tipoVeiculo(veiculo);
        }
    }
    public Emprestimo(PessoaJuridica cliente, Veiculo veiculo, int numRenovacoes) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.numRenovacoes = numRenovacoes;
        this.limiteRenovacoesGratis = tipoVeiculo(veiculo);
    }
    public int tipoVeiculo(Veiculo veiculo){
        String tipo = veiculo.getClass().getName();
        switch (tipo) {
            case "VeiculoPopular":
                return 1;
            case "VeiculoSUV": 
                return 3;
            case "VeiculoLuxo":
                return 5;
            default:
                return 0;
        }
    }
    public double calcularMulta(Veiculo veiculo){
        int limiteRenovacoes = this.limiteRenovacoesGratis;
        if(this.numRenovacoes > limiteRenovacoes){
            double multa = (this.numRenovacoes - limiteRenovacoes) * veiculo.getMulta();
            return multa;
        }
        return 0;

    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(PessoaFisica cliente) {
        this.cliente = cliente;
    }
    public void setCliente(PessoaJuridica cliente) {
        this.cliente = cliente;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public int getNumRenovacoes() {
        return numRenovacoes;
    }
    public void setNumRenovacoes(int numRenovacoes) {
        this.numRenovacoes = numRenovacoes;
    }
    public int getLimiteRenovacoesGratis() {
        return limiteRenovacoesGratis;
    }
    
    
}
