package FichaPratica02;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero;

        // Ler numero
        System.out.print("Insira um número: ");
        numero=input.nextInt();

        // Avaliar se é par
        if(numero%2==0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }


    }
}
