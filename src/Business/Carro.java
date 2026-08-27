package Business;

public class Carro extends Veiculo {
    private int quantidadeDePortas;

    public Carro(int quantidadeDePortas) {
        super();
        this.quantidadeDePortas = quantidadeDePortas;

    }

    @Override
    public  void acelerar(){
        velocidadeAtual += 10;
    }


}
