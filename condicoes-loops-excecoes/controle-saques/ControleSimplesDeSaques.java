import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        for (int i= 0; limiteDiario >= 0; i++ ){
            double valorSaque = scanner.nextDouble();
            if (valorSaque == 0){
                System.out.println("Transacoes encerradas.");
                System.exit(0);
            } else if (valorSaque <= limiteDiario){
                double limiteAtual = limiteDiario - valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteAtual);
            } else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            }
        }
        scanner.close();
    }
}
