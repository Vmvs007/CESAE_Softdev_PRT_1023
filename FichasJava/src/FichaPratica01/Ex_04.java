package FichaPratica01;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double raio, pi = 3.1415, area;

        // Ler raio
        System.out.print("Insira o raio: ");
        raio= input.nextDouble();

        // Calcular area
        area= pi*raio*raio;

        // Apresento a area
        System.out.println("Área da Circunferencia: " + area);

    }
}
