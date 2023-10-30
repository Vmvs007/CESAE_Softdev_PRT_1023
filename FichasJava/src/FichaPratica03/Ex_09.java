package FichaPratica03;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int contador=2, limite;

        // Ler limite
        System.out.print("Insira o limite: ");
        limite= input.nextInt();

        while (contador<=limite){
            System.out.println(contador);
            contador=contador+2;
        }

    }
}
