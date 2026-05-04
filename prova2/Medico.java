import java.util.LinkedList;
public class Medico extends Funcionario {
    private String crm;
    private String horInicio;
    private String horFim;
    private Especialidade especialidade;
    private LinkedList<PlanoSaude> listaPlanosdeSaude;
    public Medico(String nome, String cpf, String endereco, String telefone, double salario, String crm,
            String horInicio, String horFim, Especialidade especialidade, LinkedList<PlanoSaude> listaPlanosdeSaude) {
        super(nome, cpf, endereco, telefone, salario);
        this.crm = crm;
        this.horInicio = horInicio;
        this.horFim = horFim;
        this.especialidade = especialidade;
        this.listaPlanosdeSaude = listaPlanosdeSaude;
    }
    
    public Medico(String nome, String cpf, String endereco, String telefone, double salario, String crm,
            String horInicio, String horFim, Especialidade especialidade) {
        super(nome, cpf, endereco, telefone, salario);
        this.crm = crm;
        this.horInicio = horInicio;
        this.horFim = horFim;
        this.especialidade = especialidade;
    }
    public void registrarInformacoes(Consulta consulta, String sintomasPaciente, String prescricaoMedica, String pedidoEnxames){
        consulta.setSintomasPaciente(sintomasPaciente);
        consulta.setPrescricaoMedica(prescricaoMedica);
        if(pedidoEnxames != null || pedidoEnxames != "")
        consulta.setPedidoEnxames(pedidoEnxames);
    }
    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }
    public String getHorInicio() {
        return horInicio;
    }
    public void setHorInicio(String horInicio) {
        this.horInicio = horInicio;
    }
    public String getHorFim() {
        return horFim;
    }
    public void setHorFim(String horFim) {
        this.horFim = horFim;
    }
    public Especialidade getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
    public LinkedList<PlanoSaude> getListaPlanosdeSaude() {
        return listaPlanosdeSaude;
    }
    public void setListaPlanosdeSaude(LinkedList<PlanoSaude> listaPlanosdeSaude) {
        this.listaPlanosdeSaude = listaPlanosdeSaude;
    }
    public void addPlanoDeSaude(PlanoSaude planoSaude){
        this.listaPlanosdeSaude.add(planoSaude);
    }
    public void removePlanoDeSaude(PlanoSaude planoSaude){
        this.listaPlanosdeSaude.remove(planoSaude);
    }
    
}
