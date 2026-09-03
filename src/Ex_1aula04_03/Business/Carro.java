package Ex_1aula04_03.Business;

public class Carro extends Veiculo {
    private int quantidadeDePortas;

    public Carro(String modelo, String fabricante, int ano, int quantidadeDePortas) {
        super(modelo, fabricante, ano);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public  void acelerar(){
        if(velocidadeAtual >= 180){
            System.out.println("O limite de velocidade é 180");
            return;
        }
        velocidadeAtual += 10;
    }


}
