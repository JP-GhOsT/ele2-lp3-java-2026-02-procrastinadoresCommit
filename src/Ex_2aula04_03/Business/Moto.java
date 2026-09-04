package Ex_2aula04_03.Business;

public class Moto extends Veiculo {


    protected boolean descansoAcionado = true;

    public Moto(String modelo,String fabricante,int ano,int  quantPortas,int potencia,String tipo,String dataUltimaManutencao,String tipoServico) {
        super(modelo, fabricante, ano, potencia, tipo, dataUltimaManutencao, tipoServico);
        this.descansoAcionado = descansoAcionado;
    }

    @Override
    public void acelerar(){
        if(velocidadeAtual >= 180){
            System.out.println("O limite de velocidade é 180");
            return;
        }
        velocidadeAtual += 5;
        if(velocidadeAtual > 0){
            descansoAcionado = false;
        }
    }
    public void desacelerar(){
        if (velocidadeAtual <= 0){
            System.out.println("voce não pode desalerar mais");
            return;
        }
        velocidadeAtual -= 5;
        if(velocidadeAtual > 0){
            descansoAcionado = false;
        }
    }
    public void parar(){
        velocidadeAtual = 0;
        if(velocidadeAtual > 0){
            descansoAcionado = false;
        }
    }
    public boolean isDescansoAcionado() {
        return descansoAcionado;
    }

}
