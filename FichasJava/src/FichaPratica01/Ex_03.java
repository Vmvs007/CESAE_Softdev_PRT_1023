package FichaPratica01;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {
        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double comprimento, largura, area, perimetro;

        // Ler comprimento
        System.out.print("Insira o comprimento: ");
        comprimento = input.nextDouble();

        // Ler largura
        System.out.print("Insira a largura: ");
        largura = input.nextDouble();

        // Calcular o perimetro
        perimetro= 2*comprimento+2*largura;

        // Apresentar o perimetro
        System.out.println("Perimetro: "+perimetro);

        // Calcular a area
        area=comprimento*largura;

        // Apresentar a area
        System.out.println("Área: "+area);
    }

}
