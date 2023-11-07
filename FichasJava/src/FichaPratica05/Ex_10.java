package FichaPratica05;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][5];
        int numPesquisar, contador = 0;

        // Ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // Ler numero a pesquisar
        System.out.print("Insira o número a pesquisar: ");
        numPesquisar = input.nextInt();

        // Ciclo que vai iterar a matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                if (matriz[linha][coluna] == numPesquisar) {
                    contador++;
                }

            }
        }

        System.out.println("O numero " + numPesquisar + " aparece " + contador + " vezes na matriz.");


    }
}
