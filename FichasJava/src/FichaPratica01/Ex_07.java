package FichaPratica01;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double preco1, preco2, preco3, total;

        // Ler preco1
        System.out.print("Insira preço 1: ");
        preco1=input.nextDouble();

        // Ler preco2
        System.out.print("Insira preço 2: ");
        preco2=input.nextDouble();

        // Ler preco3
        System.out.print("Insira preço 3: ");
        preco3=input.nextDouble();

        // Calcular o total
        total = (preco1+preco2+preco3)*0.9;

        System.out.println("Preço com 10% de desconto: "+total);

    }
}
