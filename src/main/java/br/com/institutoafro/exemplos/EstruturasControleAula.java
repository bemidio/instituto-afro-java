package br.com.institutoafro.exemplos;

import java.util.Scanner;

public class EstruturasControleAula {

    public String verificarMaioridade(int idade) {

        if (idade >= 18) {
            return "Maior de idade";
        }

        return "Menor de idade";
    }

    public String verificarSePodeDirigir(int idade, boolean habilitado) {

        if (idade < 18) {
            return "Não pode dirigir";
        } else {
            if (habilitado = false) {
                return "Não pode dirigir";
            }

            return "Pode Dirigir";
        }
    }

    /**
     * @param nota
     *             Exemplo de switch
     */
    public void verificarNota(Double nota) {

        switch (nota.intValue()) {
            case 10:
            case 9:
                System.out.println("Excelente");
                break;
            case 8:
                System.out.println("Muito bom");
                break;
            case 7:
            case 6:
                System.out.println("Regular");
            default:
                System.out.println("Reprovado");
        }
    }

    /**
     * @param limite
     *               Exemplo de while
     */
    public void contarNumeros(int limite) {
        int i = 1;
        while (i <= limite) {
            System.out.println(i);
            i++;
        }
    }

    public void ocorrenciaDeLetrasNaPalavra(String letra, String palavra) {

        int tamanhoPalavra = palavra.length();
        char letraInformada = letra.charAt(0);
        int index;
        char letraAtual = (char) '0';
        int contagemOcorrencias = 0;

        for (index = 0; index < tamanhoPalavra; index++) {

            letraAtual = palavra.toCharArray()[index];

            if (letraAtual == letraInformada)
                contagemOcorrencias++;

        }

        System.out.println("A letra " + letra + " ocorre " + contagemOcorrencias + " vezes.");
    }

    public void qualNumeroCorreto(){

        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        do {

            System.out.print("Digite o número certo: ");
            numero = scanner.nextInt();

        } while (numero != 7);

        System.out.println("Você digitou o número correto: " + numero);

        scanner.close();
    }
}
