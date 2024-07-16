import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        while (true) {
            int opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;
                case 2:
                    double valorSaque = scanner.nextDouble();
                    if(saldo < valorSaque){
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorSaque;
                        System.out.printf("Saldo atual: %.1f%n ", saldo);
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f%n ", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
