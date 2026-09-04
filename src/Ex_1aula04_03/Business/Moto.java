package Ex_1aula04_03.Business;

public class Moto extends Veiculo {

    protected boolean descansoAcionado = true;

    public Moto(int ano, String fabricante, String modelo) {

        super(modelo, fabricante, ano);
    }

    @Override
    public void acelerar(){
        super.acelerar();
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
