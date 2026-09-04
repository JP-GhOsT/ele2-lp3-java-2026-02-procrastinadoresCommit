package Ex_2aula04_03.Business;

public abstract class Veiculo {
    protected String modelo;
    protected String fabricante;
    protected int ano;
    protected int velocidadeAtual = 0;

    private Motor _motor;
    private Manutencao _manutencao;

    public Veiculo(String modelo, String fabricante, int ano, int potencia, String tipo, String dataUltimaManutencao, String tipoServico) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;

        this._motor = new Motor(potencia,tipo);
        this._manutencao = new Manutencao(dataUltimaManutencao,tipoServico);

    }

    public void acelerar(){
            if(velocidadeAtual >= 180){
                System.out.println("O limite de velocidade é 180");
            return;
            }

        this.velocidadeAtual = velocidadeAtual + 5;
    }
    public void desacelerar(){
        if (velocidadeAtual <= 0){
            System.out.println("voce não pode desalerar mais");
            return;
        }
        this.velocidadeAtual = velocidadeAtual - 5;
    }
    public void parar(){

        this.velocidadeAtual = 0;
    }
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }





}
