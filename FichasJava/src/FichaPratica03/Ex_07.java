package FichaPratica03;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, antecessor, sucessor;

        // Ler num
        System.out.print("Insira um número: ");
        num=input.nextInt();

        antecessor=num-5;
        sucessor= num+5;

        // Imprimir os antecessores
        while (antecessor<num){
            System.out.println(antecessor);
            antecessor++;
        }

        num++;
        System.out.println();

        // Imprimir os sucessores
        while(num<=sucessor){
            System.out.println(num);
            num++;
        }

    }
}
