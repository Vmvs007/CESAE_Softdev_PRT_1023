package FichaPratica05;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int somatorio = 0, media;

        // Ler vetor
        for (int indice = 0; indice < vetor.length; indice++) {
            System.out.print("Insira um número no Vetor[" + indice + "]: ");
            vetor[indice] = input.nextInt();
        }

        for (int indice = 0; indice < vetor.length; indice++) {
            somatorio = somatorio + vetor[indice];
        }

        media = somatorio / vetor.length;
        System.out.println("Média dos Elementos: " + media);

    }
}
