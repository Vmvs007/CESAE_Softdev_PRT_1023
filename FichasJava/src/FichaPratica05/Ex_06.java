package FichaPratica05;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];

        // Variável booleana crescente começa a true
        boolean crescente = true;

        // Ler vetor
        for (int indice = 0; indice < vetor.length; indice++) {
            System.out.print("Insira um número no Vetor[" + indice + "]: ");
            vetor[indice] = input.nextInt();
        }

        // Ciclo que vai iterar o vetor
        for (int indice = 1; indice < vetor.length; indice++) {
            // Se o elemento atual for menor ou igual que o anterior (então não é crescente)
            if(vetor[indice]<=vetor[indice-1]){
                // Passa crescente permanentemente para false
                crescente=false;
            }
        }

        // Avalia a situação de "crescente"
        if(crescente){
            System.out.println("Vetor Crescente");
        }else{
            System.out.println("Vetor Não Crescente");
        }
    }
}
