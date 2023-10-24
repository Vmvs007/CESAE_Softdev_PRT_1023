package FichaPratica02;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int horas, minutos;

        // Ler horas
        System.out.println("Introduza o horário no sistema 24h");
        System.out.print("Horas: ");
        horas=input.nextInt();

        // Ler minutos
        System.out.print("Minutos: ");
        minutos=input.nextInt();

        if(horas<=12){ // AM
            System.out.println(horas+":"+minutos+" AM");
        }else{ // PM
            horas=horas-12;
            System.out.println(horas+":"+minutos+" PM");
        }

    }
}
