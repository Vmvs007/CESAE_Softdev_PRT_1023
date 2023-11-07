package FichaPratica05;

import java.util.Scanner;

public class Ex_07_v2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int maiorElementoPar=-1;

        // Ler vetor
        for (int indice = 0; indice < vetor.length; indice++) {
            System.out.print("Insira um número no Vetor[" + indice + "]: ");
            vetor[indice] = input.nextInt();
        }

        // Encontrar o maior par
        for (int indice = 0; indice < vetor.length; indice++) {
            if((vetor[indice]>maiorElementoPar || maiorElementoPar==-1 )&& vetor[indice]%2==0){
                maiorElementoPar=vetor[indice];
            }
        }

        if(maiorElementoPar%2==0){ // ou if(maiorElementoPar!=-1){
            System.out.println("Maior Par: "+maiorElementoPar);
        }else{
            System.out.println("Não há pares no vetor");
        }


    }
}
