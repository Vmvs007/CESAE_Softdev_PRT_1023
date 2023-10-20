package FichaPratica02;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double salario;

        // Ler salario
        System.out.print("Insira o salário: ");
        salario= input.nextDouble();

        if(salario<=15000){
            System.out.println("Taxa 20%: "+ (salario*0.2));
        }else{
            System.out.println("Taxa 30%: "+(salario*0.3));
        }


    }
}
