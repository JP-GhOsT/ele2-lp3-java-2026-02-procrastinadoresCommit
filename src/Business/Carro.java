package Business;

public class Carro extends Veiculo {
    private int quantidadeDePortas;

    public Carro(String modelo, String fabricante, int ano, int quantidadeDePortas) {
        super(modelo, fabricante, ano);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public  void acelerar(){
        velocidadeAtual += 10;
    }


}
