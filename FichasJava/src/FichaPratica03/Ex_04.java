package FichaPratica03;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int contador=0, limite;

        // Ler limite
        System.out.print("Insira o limite: ");
        limite=input.nextInt();

        // Ciclo que vai andar com o contador de 1 em 1 até chegar ao valor de limite
        while(contador<=limite){
            System.out.println(contador);

            // Aumenta 1 ao contador
            contador=contador+1;
        }

    }
}
