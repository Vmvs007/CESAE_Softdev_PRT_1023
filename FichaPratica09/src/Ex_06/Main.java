package Ex_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Instancia de Calculadora
        Calculadora calculadora = new Calculadora();

        // Declarar variaveis
        double n1, n2;

        // Ler n1
        System.out.print("Insira um numero: ");
        n1 = input.nextDouble();

        // Ler n2
        System.out.print("Insira um numero: ");
        n2 = input.nextDouble();

        System.out.println("Soma: "+calculadora.soma(n1,n2));
        System.out.println("Subtracao: "+calculadora.subtracao(n1,n2));
        System.out.println("Multiplicacao: "+calculadora.multiplicacao(n1,n2));
        System.out.println("Divisao: "+calculadora.divisao(n1,n2));

    }
}
