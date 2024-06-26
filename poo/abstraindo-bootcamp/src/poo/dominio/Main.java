package poo.dominio;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Bootcamp bootcamp = criarBootcamp();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Inscrever Dev");
            System.out.println("2. Progredir Dev");
            System.out.println("3. Mostrar Conteúdos de um Dev");
            System.out.println("4. Mostrar XP de um Dev");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    inscreverDev(scanner, bootcamp);
                    break;
                case 2:
                    progredirDev(scanner, bootcamp);
                    break;
                case 3:
                    mostrarConteudosDev(scanner, bootcamp);
                    break;
                case 4:
                    mostrarXpDev(scanner, bootcamp);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static Bootcamp criarBootcamp() {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java em 15 dias");
        mentoria.setData(LocalDate.now().plusDays(15));

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descrição bootcamp Java Developer");
        bootcamp.addConteudo(curso1);
        bootcamp.addConteudo(curso2);
        bootcamp.addConteudo(mentoria);

        return bootcamp;
    }

    private static void inscreverDev(Scanner scanner, Bootcamp bootcamp) {
        System.out.print("Nome do Dev: ");
        String nomeDev = scanner.nextLine();
        Dev dev = new Dev();
        dev.setNome(nomeDev);
        try {
            bootcamp.inscreverDev(dev);
            System.out.println("Dev inscrito com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void progredirDev(Scanner scanner, Bootcamp bootcamp) {
        System.out.print("Nome do Dev: ");
        String nomeDev = scanner.nextLine();
        Dev dev = bootcamp.getDevsInscritos().stream()
                .filter(d -> d.getNome().equals(nomeDev))
                .findFirst()
                .orElse(null);
        if (dev == null) {
            System.out.println("Dev não encontrado!");
            return;
        }
        dev.progredir();
        System.out.println("Dev progrediu com sucesso!");
    }

    private static void mostrarConteudosDev(Scanner scanner, Bootcamp bootcamp) {
        System.out.print("Nome do Dev: ");
        String nomeDev = scanner.nextLine();
        Dev dev = bootcamp.getDevsInscritos().stream()
                .filter(d -> d.getNome().equals(nomeDev))
                .findFirst()
                .orElse(null);
        if (dev == null) {
            System.out.println("Dev não encontrado!");
            return;
        }
        System.out.println("Conteúdos Inscritos: " + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + dev.getConteudosConcluidos());
    }

    private static void mostrarXpDev(Scanner scanner, Bootcamp bootcamp) {
        System.out.print("Nome do Dev: ");
        String nomeDev = scanner.nextLine();
        Dev dev = bootcamp.getDevsInscritos().stream()
                .filter(d -> d.getNome().equals(nomeDev))
                .findFirst()
                .orElse(null);
        if (dev == null) {
            System.out.println("Dev não encontrado!");
            return;
        }
        System.out.println("XP Total: " + dev.calcularTotalXp());

    }
}
