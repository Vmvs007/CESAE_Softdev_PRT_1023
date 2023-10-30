package FichaPratica03;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int contador=0, salto, limite;

        // Ler limite
        System.out.print("Insira o limite: ");
        limite= input.nextInt();

        // Ler salto
        System.out.print("Insira o salto: ");
        salto=input.nextInt();

        while (contador<=limite){
            System.out.println(contador);
            contador=contador+salto;
        }

    }
}
