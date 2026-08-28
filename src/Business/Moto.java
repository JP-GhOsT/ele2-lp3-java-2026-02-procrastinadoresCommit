package Business;

public class Moto extends Veiculo {

    protected boolean descansoAcionado = true;

    public Moto(int ano, String fabricante, String modelo) {
        super(ano, fabricante, modelo);
    }

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
