package FichaPratica02;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int valor1, valor2, valor3;

        // Ler valor1
        System.out.print("Insira um valor: ");
        valor1= input.nextInt();

        // Ler valor2
        System.out.print("Insira um valor: ");
        valor2= input.nextInt();

        // Ler valor3
        System.out.print("Insira um valor: ");
        valor3= input.nextInt();

        // Imprimir o menor deles
        if(valor1<valor2 && valor1<valor3){ // Valor 1 menor
            System.out.println("Menor: "+valor1);
        }

        if(valor2<valor1 && valor2<valor3){ // Valor 2 menor
            System.out.println("Menor: "+valor2);
        }

        if(valor3<valor1 && valor3<valor2){ // Valor 3 menor
            System.out.println("Menor: "+valor3);
        }

    }
}
