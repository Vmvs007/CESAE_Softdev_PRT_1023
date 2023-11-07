package FichaPratica05;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int menorElemento;

        // Ler vetor
        for(int indice=0; indice<10; indice++){
            System.out.print("Insira um número no Vetor["+indice+"]: ");
            vetor[indice]= input.nextInt();
        }

        // Inicializar o menor elemento com o primeiro elemento do vetor
        menorElemento=vetor[0];

        // Ciclo que vai iterar o vetor
        for(int indice=0; indice<10; indice++){
            // Se o elemento atual for menor que o "menorElemento"
            if(vetor[indice]<menorElemento){
                menorElemento= vetor[indice];
            }
        }

        // Imprimir menor elemento
        System.out.println("Menor Elemento: "+menorElemento);

    }
}
