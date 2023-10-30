package FichaPratica03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numAnt, numAtual, quantidadeNumeros, contador = 1;
        boolean crescente = true;

        // Ler quantidadeNumeros
        System.out.print("Quantos números deseja inserir: ");
        quantidadeNumeros = input.nextInt();

        // Ler numAnt
        System.out.print("Insira um numero: ");
        numAnt = input.nextInt();

        while (contador < quantidadeNumeros) {

            // Ler numAnt
            System.out.print("Insira um numero: ");
            numAtual = input.nextInt();

            if (numAnt >= numAtual) {
                // Sequencia deixa de ser crescente
                crescente = false;
            }

            numAnt = numAtual;
            contador++;
        }

        if(crescente){
            System.out.println("Crescente");
        }else{
            System.out.println("Não crescente");
        }

    }
}
