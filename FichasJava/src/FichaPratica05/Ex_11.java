package FichaPratica05;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][3];
        int maior, menor;

        // Ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        maior = matriz[0][0];
        menor = matriz[0][0];

        // Ciclo que vai iterar a matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                if(matriz[linha][coluna]>maior){
                    maior=matriz[linha][coluna];
                }

                if(matriz[linha][coluna]<menor){
                    menor=matriz[linha][coluna];
                }

            }
        }

        // Imprimir a matriz na consola
        for (int linha = 0; linha <  matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna]+ "\t");
            }
            System.out.println();
        }

        System.out.println("\nMenor: "+menor);
        System.out.println("Maior: "+maior);

    }
}
