package FichaPratica05;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int maiorElemento;

        // Ler vetor
        for(int indice=0; indice<10; indice++){
            System.out.print("Insira um número no Vetor["+indice+"]: ");
            vetor[indice]= input.nextInt();
        }

        maiorElemento=vetor[0];

        for(int indice=0; indice<10; indice++){
            if(vetor[indice]>maiorElemento){
                maiorElemento= vetor[indice];
            }
        }

        System.out.println("Maior Elemento: "+maiorElemento);

    }
}
