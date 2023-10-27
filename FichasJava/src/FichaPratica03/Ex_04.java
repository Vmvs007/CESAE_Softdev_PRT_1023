package FichaPratica03;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int contador=0, limite;

        // Ler limite
        System.out.print("Insira o limite: ");
        limite=input.nextInt();

        while(contador<=limite){
            System.out.println(contador);
            contador=contador+1;
        }

    }
}
