package poo.bancodigital;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);

        banco.setNome("Banco Digital");
        boolean sair = false;
        while (!sair) {
            System.out.println("=== Banco Digital ===");
            System.out.println("1. Criar Conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir");
            System.out.println("5. Imprimir Extrato");
            System.out.println("6. Listar Contas");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    criarConta(banco, scanner);
                    break;
                case 2:
                    realizarDeposito(banco, scanner);
                    break;
                case 3:
                    realizarSaque(banco, scanner);
                    break;
                case 4:
                    realizarTransferencia(banco, scanner);
                    break;
                case 5:
                    imprimirExtrato(banco, scanner);
                    break;
                case 6:
                    banco.listarContas();
                    break;
                case 7:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }

    private static void criarConta(Banco banco, Scanner scanner) {
        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        Cliente cliente = new Cliente();
        cliente.setNome(nomeCliente);

        System.out.println("Tipo de conta: ");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        int tipoConta = scanner.nextInt();
        scanner.nextLine();

        Conta novaConta = null;
        if (tipoConta == 1) {
            novaConta = new ContaCorrente(cliente);
        } else if (tipoConta == 2) {
            novaConta = new ContaPoupanca(cliente);
        }

        if (novaConta != null) {
            banco.addConta(novaConta);
            System.out.println("Conta criada com sucesso.");
        } else {
            System.out.println("Tipo de conta inválido.");
        }
    }

    private static void realizarDeposito(Banco banco, Scanner scanner) {
        Conta conta = buscarConta(banco, scanner);
        if (conta != null) {
            System.out.print("Valor do depósito: ");
            double valor = scanner.nextDouble();
            conta.depositar(valor);
            System.out.println("Depósito realizado com sucesso.");
        }
    }

    private static void realizarSaque(Banco banco, Scanner scanner) {
        Conta conta = buscarConta(banco, scanner);
        if (conta != null) {
            System.out.print("Valor do saque: ");
            double valor = scanner.nextDouble();
            conta.sacar(valor);
        }
    }

    private static void realizarTransferencia(Banco banco, Scanner scanner) {
        System.out.println("=== CONTA ORIGEM ===");
        Conta contaOrigem = buscarConta(banco, scanner);
        System.out.println("=== CONTA DESTINO ===");
        Conta contaDestino = buscarConta(banco, scanner);

        if (contaOrigem != null && contaDestino != null) {
            System.out.print("Valor da transferência: ");
            double valor = scanner.nextDouble();
            contaOrigem.transferir(valor, contaDestino);
        }
    }

    private static void imprimirExtrato(Banco banco, Scanner scanner) {
        Conta conta = buscarConta(banco, scanner);
        if (conta != null) {
            conta.imprimirExtrato();
        }
    }

    private static Conta buscarConta(Banco banco, Scanner scanner) {
        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();

        for (Conta conta : banco.getContas()) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }

        System.out.println("Conta não encontrada.");
        return null;
    }
}
