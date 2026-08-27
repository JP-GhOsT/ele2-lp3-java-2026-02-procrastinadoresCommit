package Business;

public class Moto extends Veiculo {

    protected boolean descansoAcionado = true;

    @Override
    public void acelerar(){
        velocidadeAtual += 5;
        if(velocidadeAtual > 0){
            descansoAcionado = false;
        }
    }
    public void desacelerar(){
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


}
