package FichaPratica02;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double num1, num2, resultado;
        String operacao;

        // Ler num1
        System.out.print("Insira um número: ");
        num1= input.nextDouble();

        // Ler num2
        System.out.print("Insira um número: ");
        num2= input.nextDouble();

        // Ler operacao
        System.out.print("Operação Aritmética (+ - * /): ");
        operacao= input.next();

        switch (operacao){
            case "+": // Soma
                resultado=num1+num2;
                System.out.println(resultado);
                break;

            case "-": // Subtração
                resultado=num1-num2;
                System.out.println(resultado);
                break;

            case "*": // Multiplicação
                resultado=num1*num2;
                System.out.println(resultado);
                break;

            case "/": // Divisão
                resultado=num1/num2;
                System.out.println(resultado);
                break;

            default:
                System.out.println("Operação Aritmética não reconhecida");
        }

    }
}
