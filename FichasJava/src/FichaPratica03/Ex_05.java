package FichaPratica03;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int inicio, limite;

        // Ler inicio
        System.out.print("Insira o início: ");
        inicio=input.nextInt();

        // Ler limite
        System.out.print("Insira o limite: ");
        limite=input.nextInt();

        while (inicio<=limite){
            System.out.println(inicio);
            inicio++; // inicio = inicio + 1;
        }
    }
}
