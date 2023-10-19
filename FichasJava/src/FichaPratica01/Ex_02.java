package FichaPratica01;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double num1, num2, resultado;

        // Ler num1
        System.out.print("Insira o número: ");
        num1 = input.nextDouble();

        // Ler num2
        System.out.print("Insira o número: ");
        num2 = input.nextDouble();

        // Calcular soma
        resultado = num1+num2;

        // Apresentar soma
        System.out.println("Soma: "+resultado);

        // Calcular subtração
        resultado=num1-num2;

        // Apresentar subtração
        System.out.println("Subtração: "+resultado);

        // Calcular multiplicação
        resultado=num1*num2;

        // Apresentar multiplicação
        System.out.println("Multilicação: "+resultado);

        // Calcular divisão
        resultado=num1/num2;

        // Apresentar divisão
        System.out.println("Divisão: "+resultado);

    }
}
