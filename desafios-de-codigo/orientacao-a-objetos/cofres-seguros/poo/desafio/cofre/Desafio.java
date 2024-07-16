package poo.desafio.cofre;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {
            int senha = scanner.nextInt();
            CofreDigital cofre = new CofreDigital(senha);
            cofre.imprimirInformacoes();

            int confirmarSenha = scanner.nextInt();
            if (cofre.validarSenha(confirmarSenha)) {
                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Senha incorreta!");
            }
        } else if (tipoCofre.equalsIgnoreCase("fisico")){
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        } else {
            System.out.println("Tipo de cofre invalido!");
        }
    }
}
