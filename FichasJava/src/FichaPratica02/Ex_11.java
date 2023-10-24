package FichaPratica02;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double saldo, movimento, saldoFinal;

        // Ler saldo
        System.out.print("Insira o saldo: ");
        saldo= input.nextDouble();

        // Ler montante a movimentar
        System.out.print("Insira o montante a movimentar: ");
        movimento= input.nextDouble();

        // Calcular saldo após movimento
        saldoFinal=saldo+movimento;

        if(saldoFinal>=0){ // Movimento válido
            System.out.println("Operação Válida. Saldo Final: "+saldoFinal);
        }else{ // Movimento inválido
            System.out.println("Operação Inválida. Saldo Final: "+saldo);
        }

    }
}
