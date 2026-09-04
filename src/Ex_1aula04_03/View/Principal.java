package Ex_1aula04_03.View;

import Ex_1aula04_03.Business.Carro;
import Ex_1aula04_03.Business.Moto;
import Ex_1aula04_03.Business.Veiculo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Veiculo veiculo = null;

        System.out.println("Escolha o veiculo 1 - carro 2 - moto");
        int x = sc.nextInt();

        System.out.println("Digite o modelo");
        String modelo = sc.next();

        System.out.println("Digite a marca");
        String fabricante = sc.next();

        System.out.println("Digite o ano");
        int ano = sc.nextInt();

        System.out.println("Digite a potencia do motor");
        int potencia = sc.nextInt();

        System.out.println("Digite o tipo do motor");
        String tipo = sc.next();

        System.out.println("Digite a data da ultima manutencao");
        String ultimaManute = sc.next();

        System.out.println("Digite o tipo de servico");
        String tipoServico = sc.next();
        switch (x) {
            case 1:
                int quantPortas;

                do {
                    System.out.println("Digite quantas portas");
                    quantPortas = sc.nextInt();

                    if (quantPortas <= 0) {
                        System.out.println("Quantidade inválida!");
                    }

                } while (quantPortas <= 0);

                veiculo = new Carro(modelo, fabricante, ano, quantPortas, potencia, tipo, ultimaManute, tipoServico);
                break;

            case 2:
                veiculo = new Moto(ano, fabricante, modelo);
                break;

            default:
                System.out.println("Não existem mais escolhas disponíveis");
                return;
        }

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Desacelerar");
            System.out.println("3 - Parar");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    veiculo.acelerar();
                    System.out.println("Você acelerou! Velocidade atual: " + veiculo.getVelocidadeAtual() + " km/h");
                    break;

                case 2:
                    veiculo.desacelerar();
                    System.out.println("Você desacelerou! Velocidade atual: " + veiculo.getVelocidadeAtual() + " km/h");
                    break;

                case 3:
                    veiculo.parar();
                    System.out.println("Você parou! Velocidade atual: " + veiculo.getVelocidadeAtual() + " km/h");
                    break;

                case 4:
                    System.out.println("Saindo do programa...");
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }



    }
}