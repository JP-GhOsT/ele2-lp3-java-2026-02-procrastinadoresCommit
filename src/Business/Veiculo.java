package Business;

public abstract class Veiculo {
    protected String modelo;
    protected String fabricante;
    protected int ano;
    protected int velocidadeAtual;

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
