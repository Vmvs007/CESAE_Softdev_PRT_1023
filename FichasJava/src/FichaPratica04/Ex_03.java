package FichaPratica04;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numeroSecreto, tentativa, contagemTentativas = 0;

        // Ler numeroSecreto
        do {
            System.out.print("Jogador 1. Insira o número secreto (0-100): ");
            numeroSecreto = input.nextInt();
        } while (numeroSecreto < 0 || numeroSecreto > 100);

        // Limpeza de consola batoteira
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        do {
            // Aumentar uma tentativa
            contagemTentativas++;

            // Ler tentativa
            System.out.print("Jogador 2. Tentativa: ");
            tentativa = input.nextInt();

            // Se o número Secreto for maior
            if (tentativa < numeroSecreto) {
                System.out.println("Número Secreto é Maior");
            }

            // Se o número Secreto for menor
            if (tentativa > numeroSecreto) {
                System.out.println("Número Secreto é Menor");
            }

        } while (tentativa != numeroSecreto); // Só para de perguntar tentativas quando os números forem iguais

        System.out.println("Parabéns! Acertou no Número Secreto " + numeroSecreto);
        System.out.println("Tentou " + contagemTentativas + " vezes");


    }
}
