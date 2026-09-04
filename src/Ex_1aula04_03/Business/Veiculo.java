package Ex_1aula04_03.Business;

public abstract class Veiculo {
    protected String modelo;
    protected String fabricante;
    protected int ano;
    protected int velocidadeAtual = 0;
    protected int VELOCIDADEMAX = 180;

    public Veiculo(String modelo, String fabricante, int ano) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
    }

    public void acelerar(){
            if(velocidadeAtual >= VELOCIDADEMAX){
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
