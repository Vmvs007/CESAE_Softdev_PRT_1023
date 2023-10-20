package FichaPratica02;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2;

        // Ler num1
        System.out.print("Insira um numero: ");
        num1= input.nextInt();

        // Ler num2
        System.out.print("Insira um numero: ");
        num2= input.nextInt();

        if(num1>num2){ // Maior: num1
            System.out.println("Maior: " + num1);
        }

        if(num1<num2){ // Maior: num2
            System.out.println("Maior: " + num2);
        }

        if(num1==num2){ // São iguais
            System.out.println("São iguais");
        }





    }
}
