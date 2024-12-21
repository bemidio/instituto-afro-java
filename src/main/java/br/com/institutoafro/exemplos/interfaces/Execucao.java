package br.com.institutoafro.exemplos.interfaces;

import java.util.Scanner;

public class Execucao {

    private int getOpcaoNumerica(Scanner scanner) {

        int opcao = 0;

        try {
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.nextLine();
                throw new Exception("Não é um número valido");
            }
        } catch (Exception e) {
            System.out.println("Não é um número valido");
            opcao = 99;
        }

        return opcao;
    }

    public void executar() {
        try (Scanner scanner = new Scanner(System.in)) {

            Funcionario funcionario = null;

            int opcao = 0;

            do {

                System.out.println("--------------------------------------------------");
                System.out.println("Qual profissional você deseja conhecer a atividade?");
                System.out.println("1 = Diretor.");
                System.out.println("2 = Professor.");
                System.out.println("3 = Auxiliar de Limpeza.");
                System.out.println("0 = Sair.");

                opcao = getOpcaoNumerica(scanner);

                if (opcao != 0) {

                    switch (opcao) {
                        case 1:
                            funcionario = new Diretor();
                            funcionario.executarTrabalho();
                            break;
                        case 2:
                            funcionario = new Professor();
                            funcionario.executarTrabalho();
                            break;
                        case 3:
                            funcionario = new AuxiliarLimpeza();
                            funcionario.executarTrabalho();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                }
            } while (opcao != 0);

            scanner.close();

            System.out.println("Execucao finalizada.");
        }
    };
}
