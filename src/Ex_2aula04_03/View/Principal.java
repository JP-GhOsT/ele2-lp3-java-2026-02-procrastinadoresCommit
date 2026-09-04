package Ex_2aula04_03.View;

import Ex_1aula04_03.Business.Carro;
import Ex_1aula04_03.Business.Moto;
import Ex_1aula04_03.Business.Veiculo;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Veiculo veiculo = null;

        System.out.println("Escolha o veiculo  1 - carro 2 - moto");
        int x = sc.nextInt();

        switch (x) {
            case 1:
                int quantPortas;

                do {
                    System.out.println("Digite quantas portas você quer:");
                    quantPortas = sc.nextInt();

                    if (quantPortas <= 0) {
                        System.out.println("Isso é impossível.");
                    }

                } while (quantPortas <= 0);

                System.out.println("Digite a potência do motor:");
                int potencia = sc.nextInt();

                sc.nextLine();

                System.out.println("Digite o tipo do motor:");
                String tipo = sc.nextLine();

                System.out.println("Digite a data da última manutenção:");
                String dataUltimaManutencao = sc.nextLine();

                System.out.println("Digite o tipo de serviço:");
                String tipoServico = sc.nextLine();

                veiculo = new Carro("Corolla", "Toyota", 2024, quantPortas, potencia, tipo, dataUltimaManutencao, tipoServico);
                break;
            case 2:

                veiculo = new Moto(2016, "Yamaha", "FZ 25");

                break;
            default:
                System.out.println("Não existem mais escolhas disponiveis");
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