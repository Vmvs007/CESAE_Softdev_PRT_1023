package FichaPratica02;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int valor1, valor2;

        // Ler valor1
        System.out.print("Insira um valor: ");
        valor1 = input.nextInt();

        // Ler valor2
        System.out.print("Insira um valor: ");
        valor2 = input.nextInt();


        if (valor1 < valor2) {
            System.out.println(valor2 + " " + valor1);
        } else {
            System.out.println(valor1 + " " + valor2);
        }


    }
}
