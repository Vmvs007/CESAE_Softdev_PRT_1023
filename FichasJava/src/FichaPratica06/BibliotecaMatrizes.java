package FichaPratica06;

public class BibliotecaMatrizes {

    public static void imprimirMatrizInteiros(int[][] matriz){
        // Imprimir a matriz na consola
        for (int linha = 0; linha <  matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna]+ "\t");
            }
            System.out.println();
        }

    }

}
