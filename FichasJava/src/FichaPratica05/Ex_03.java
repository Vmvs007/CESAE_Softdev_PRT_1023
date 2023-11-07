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

        // Inicializar o maior elemento com o primeiro elemento do vetor
        maiorElemento=vetor[0];

        // Ciclo que vai iterar o vetor
        for(int indice=0; indice<10; indice++){
            // Se o elemento atual for maior que o "maiorElemento"
            if(vetor[indice]>maiorElemento){
                maiorElemento= vetor[indice];
            }
        }

        // Imprimir maior elemento
        System.out.println("Maior Elemento: "+maiorElemento);

    }
}
