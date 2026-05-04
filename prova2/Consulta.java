public class Consulta {
    private boolean isParticular;
    private Paciente paciente;
    private Medico medico;
    private Secretario secretario;
    private String dataInicio;
    private String dataFim;
    private PlanoSaude planoSaude;
    private double valor;
    private String sintomasPaciente = null;
    private String prescricaoMedica = null;
    private String pedidoEnxames = null;
    public Consulta(boolean isParticular, Paciente paciente, Medico medico, Secretario secretario, String dataInicio,
            String dataFim, double valor) {
                if(isParticular){
        this.isParticular = isParticular;
        this.paciente = paciente;
        this.medico = medico;
        this.secretario = secretario;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valor = valor;
    } else{
        return;
    }
    }
    public Consulta(boolean isParticular, Paciente paciente, Medico medico, Secretario secretario, String dataInicio,
            String dataFim, PlanoSaude planoSaude, double valor) {
        this.isParticular = isParticular;
        this.paciente = paciente;
        this.medico = medico;
        this.secretario = secretario;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.planoSaude = planoSaude;
        this.valor = valor;
    }
    
    
    public String getSintomasPaciente() {
        return sintomasPaciente;
    }
    public void setSintomasPaciente(String sintomasPaciente) {
        this.sintomasPaciente = sintomasPaciente;
    }
    public String getPrescricaoMedica() {
        return prescricaoMedica;
    }
    public void setPrescricaoMedica(String prescricaoMedica) {
        this.prescricaoMedica = prescricaoMedica;
    }
    public String getPedidoEnxames() {
        return pedidoEnxames;
    }
    public void setPedidoEnxames(String pedidoEnxames) {
        this.pedidoEnxames = pedidoEnxames;
    }
    public boolean isParticular() {
        return isParticular;
    }
    public void setParticular(boolean isParticular) {
        this.isParticular = isParticular;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Secretario getSecretario() {
        return secretario;
    }
    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }
    public String getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }
    public String getDataFim() {
        return dataFim;
    }
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
    public PlanoSaude getPlanoSaude() {
        return planoSaude;
    }
    public void setPlanoSaude(PlanoSaude planoSaude) {
        this.planoSaude = planoSaude;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
