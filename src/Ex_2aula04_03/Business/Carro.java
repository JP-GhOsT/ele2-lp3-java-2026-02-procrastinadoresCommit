package Ex_2aula04_03.Business;

public class Carro extends Veiculo {
    private int quantidadeDePortas;


    public Carro(String modelo,String fabricante,int ano,int  quantPortas,int potencia,String tipo,String dataUltimaManutencao,String tipoServico) {
        super(modelo, fabricante, ano, potencia, tipo, dataUltimaManutencao, tipoServico);
        this.quantidadeDePortas = quantPortas;
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
