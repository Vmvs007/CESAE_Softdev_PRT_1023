package FichaPratica01;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double media, valor1, valor2, valor3;

        // Ler valor1
        System.out.print("Insira um valor: ");
        valor1=input.nextDouble();

        // Ler valor2
        System.out.print("Insira um valor: ");
        valor2=input.nextDouble();

        // Ler valor3
        System.out.print("Insira um valor: ");
        valor3=input.nextDouble();

        // Calcular a media aritmetica
        media= (valor1+valor2+valor3)/3;

        // Apresentar a media aritmetica
        System.out.println("Média Aritmética: " + media);

        // Calcular a media ponderada
        media = (valor1*0.20)+(valor2*0.3)+(valor3*0.5);

        // Apresentar a media ponderada
        System.out.println("Média Ponderada: " + media);

    }
}


