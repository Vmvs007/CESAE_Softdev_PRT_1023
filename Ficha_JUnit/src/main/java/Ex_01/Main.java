package Ex_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calculator calculadora = new Calculator();

        int num1 = 0, num2 = 0;
        String operacao;

        do {

            boolean estaTudoOk = false;

            // Ler inteiro do utilizador
            do {

                try {

                    System.out.print("Insira um número inteiro: ");
                    num1 = input.nextInt();
                    estaTudoOk = true;

                } catch (InputMismatchException exc) {
                    System.out.println("Não sabes ler? Eu disse um numero inteiro!!!");
                    input.nextLine();
                }

            } while (!estaTudoOk);


            System.out.print("Operação Aritmética (+ - * /): ");
            operacao = input.next();

            System.out.print("Insira um número: ");
            num2 = input.nextInt();

            switch (operacao) {
                case "+":
                    System.out.println("Soma: " + calculadora.add(num1, num2));
                    break;

                case "-":
                    System.out.println("Subtração: " + calculadora.subtract(num1, num2));
                    break;

                case "*":
                    System.out.println("Multiplicação: " + calculadora.multiply(num1, num2));
                    break;

                case "/":
                    try {
                        System.out.println("Divisão: " + calculadora.divide(num1, num2));
                    } catch (IllegalArgumentException exc) {
                        System.out.println("Impossível dividir por 0");
                    }

                    break;
            }


        } while (true);

    }
}