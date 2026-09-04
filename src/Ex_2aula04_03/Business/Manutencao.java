package Ex_2aula04_03.Business;

public class Manutencao {
    protected String dataUltimaManutencao;
    protected String tipoServico;

    public Manutencao(String dataUltimaManutencao, String tipoServico) {
        this.dataUltimaManutencao = dataUltimaManutencao;
        this.tipoServico = tipoServico;
    }

    @Override
    public String toString() {
        return " Data da ultima manutencao :" + dataUltimaManutencao + " tipo de Servico " + tipoServico;
    }
}
