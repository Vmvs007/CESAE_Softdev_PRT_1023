package FichaPratica02;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double nota1, nota2, nota3, mediaPonderada;

        // Ler nota1
        System.out.print("Insira a 1º nota: ");
        nota1= input.nextDouble();

        // Ler nota2
        System.out.print("Insira a 2º nota: ");
        nota2= input.nextDouble();

        // Ler nota3
        System.out.print("Insira a 3º nota: ");
        nota3= input.nextDouble();

        // Calcular a média ponderada
        mediaPonderada=(nota1*0.25)+(nota2*0.35)+(nota3*0.40);

        // System.out.println("Média Ponderada: "+mediaPonderada);

        // Avaliar se o aluno está ou não aprovado
        if(mediaPonderada>=9.5){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado...");
        }

    }
}
