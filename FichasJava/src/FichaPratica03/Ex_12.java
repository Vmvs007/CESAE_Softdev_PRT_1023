package FichaPratica03;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int inicio, fim;

        // Ler inicio
        System.out.print("Insira o inicio: ");
        inicio=input.nextInt();

        // Ler fim
        System.out.print("Insira o fim: ");
        fim=input.nextInt();

        while (inicio<=fim){
            if(inicio%5==0){
                System.out.println(inicio);
            }
            inicio++;
        }
    }
}
