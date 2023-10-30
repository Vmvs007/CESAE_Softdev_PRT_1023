package FichaPratica03;

import java.util.Scanner;

public class Ex_07_v2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num,sucessor;

        // Ler num
        System.out.print("Insira um número: ");
        num=input.nextInt();

        sucessor=num+5;
        num=num-5;

        while (num<=sucessor){
            if(num!=sucessor-5){
                System.out.println(num);
            }else {
                System.out.println();
            }
            num++;
        }
    }
}
