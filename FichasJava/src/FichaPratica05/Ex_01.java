package FichaPratica05;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];

        // Ler vetor
        for(int indice=0; indice<10; indice++){
            System.out.print("Insira um número no Vetor["+indice+"]: ");
            vetor[indice]= input.nextInt();
        }


        // Imprimir o vetor
        for(int indice=0; indice<10; indice++){
            System.out.println("Vetor["+indice+"]: "+vetor[indice]);
        }

        // Imprimir vetor em linha (opcional)
        System.out.print("\n[");
        for(int indice=0; indice<10; indice++){
            if(indice<9){
                System.out.print(vetor[indice]+" , ");
            }else{
                System.out.print(vetor[indice]);
            }

        }
        System.out.print("]");

    }
}
