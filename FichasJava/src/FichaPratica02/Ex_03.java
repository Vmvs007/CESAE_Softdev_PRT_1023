package FichaPratica02;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double salario, taxa;

        // Ler salario
        System.out.print("Insira o salário: ");
        salario= input.nextDouble();


        if(salario<=15000){ // Salário inferior ou igual a 15000
            taxa=salario*0.2;
            System.out.println("Taxa de 20%: "+taxa);
        }

        if(salario>15000 && salario<=20000){ // Salário entre 15000 e 20000
            taxa=salario*0.3;
            System.out.println("Taxa de 30%: "+taxa);
        }

        if(salario>20000 && salario<=25000){ // Salário entre 20000 e 25000
            taxa=salario*0.35;
            System.out.println("Taxa de 35%: "+taxa);
        }

        if(salario>25000){ // Salário superior ou igual a 25000
            taxa=salario*0.4;
            System.out.println("Taxa de 40%: "+taxa);
        }


    }
}
