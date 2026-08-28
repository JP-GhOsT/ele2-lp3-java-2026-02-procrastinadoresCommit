package View;

import Business.Carro;
import Business.Moto;
import Business.Veiculo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);


        System.out.println("Escolha o veiculo  1 - carro 2 - moto");
        int x = sc.nextInt();

        switch (x){
            case 1 :
                int quantPortas =0;
                do {
                    System.out.println(" Digite quantas portas voce quer");
                    quantPortas = sc.nextInt();
                    if (quantPortas <= 0) {
                        System.out.println("Isso é impossivel encerrando o programa");
                        break;
                    }
                }while(quantPortas <=0);
                Carro car =  new Carro("Corolla","Toyota",2024,quantPortas);

                break;
            case 2 :

                Moto cycle = new Moto(2016,"Yamaha","FZ 25");

                break;
            default:
                System.out.println("Não existem mais escolhas disponiveis");
        }


    }
}