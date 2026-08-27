package Business;

public abstract class Veiculo {
    private String modelo;
    private String fabricante;
    private int ano;
    private int velocidadeAtual;

    public void acelerar(){
        this.velocidadeAtual = velocidadeAtual + 5;
    }
    public void desacelerar(){
        this.velocidadeAtual = velocidadeAtual - 5;
    }
    public void parar(){
        this.velocidadeAtual = 0;
    }





}
