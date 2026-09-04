package Ex_2aula04_03.Business;



public class Motor {
    protected int potencia;
    protected String tipo;


    public Motor(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return " Potência :" + potencia + " Tipo " + tipo;
    }
}
