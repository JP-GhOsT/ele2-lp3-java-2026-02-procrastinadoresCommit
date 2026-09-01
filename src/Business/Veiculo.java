package Business;

public abstract class Veiculo {
    protected String modelo;
    protected String fabricante;
    protected int ano;
    protected int velocidadeAtual = 0;

    public Veiculo(String modelo, String fabricante, int ano) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
    }

    public void acelerar(){

        this.velocidadeAtual = velocidadeAtual + 5;
    }
    public void desacelerar(){

        this.velocidadeAtual = velocidadeAtual - 5;
    }
    public void parar(){

        this.velocidadeAtual = 0;
    }
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }





}
