package FichaPratica05;

import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class Ex_12 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[][] matriz = new int[10][2];

        // Ler vetor1
        for (int indice = 0; indice < vetor1.length; indice++) {
            System.out.print("Insira um número no Vetor1[" + indice + "]: ");
            vetor1[indice] = input.nextInt();
        }

        // Ler vetor2
        for (int indice = 0; indice < vetor2.length; indice++) {
            System.out.print("Insira um número no Vetor2[" + indice + "]: ");
            vetor2[indice] = input.nextInt();
        }

        // Iterar as linhas da matriz
        for (int indice = 0; indice < matriz.length; indice++) {
            matriz[indice][0]=vetor1[indice];
            matriz[indice][1]=vetor2[indice];
        }



    }
}
