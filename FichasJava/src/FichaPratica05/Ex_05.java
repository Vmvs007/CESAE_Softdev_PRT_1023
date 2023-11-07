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

        // Ciclo que vai iterar o vetor
        for (int indice = 0; indice < vetor.length; indice++) {
            // Calcular o somatório somando todos os elementos do vetor
            somatorio = somatorio + vetor[indice];
        }

        // Calcular a média: somatorio/nº de elementos
        media = somatorio / vetor.length;

        // Imprimir a media
        System.out.println("Média dos Elementos: " + media);

    }
}
