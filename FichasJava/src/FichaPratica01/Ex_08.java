package FichaPratica01;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        // Instanciar o Scanner (obrigatório para todos os exercícios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int minutosTotais, segundosTotais, segundosTotaisAlbum, horas,minutos, segundos;

        // Ler minutos musica 1
        System.out.print("Insira minutos da musica 1: ");
        minutosTotais = input.nextInt();

        // Ler segundos musica 1
        System.out.print("Insira segundos da musica 1: ");
        segundosTotais = input.nextInt();

        // Ler minutos musica 2
        System.out.print("Insira minutos da musica 2: ");
        minutosTotais = minutosTotais + input.nextInt();

        // Ler segundos musica 2
        System.out.print("Insira segundos da musica2: ");
        segundosTotais = segundosTotais+input.nextInt();

        // Ler minutos musica 3
        System.out.print("Insira minutos da musica 3: ");
        minutosTotais = minutosTotais + input.nextInt();

        // Ler segundos musica 3
        System.out.print("Insira segundos da musica 3: ");
        segundosTotais = segundosTotais+input.nextInt();

        System.out.println("Minutos Totais: "+minutosTotais);
        System.out.println("Segundos Totais: "+segundosTotais);

        // Calcular o total de segundos do album
        segundosTotaisAlbum=(minutosTotais*60)+segundosTotais;
        System.out.println("Segundos Totais do Album: "+segundosTotaisAlbum);

        // Calcular as horas
        horas=segundosTotaisAlbum/3600;

        // Calcular os minutos
        minutos= (segundosTotaisAlbum/60)-(horas*60);

        //Calcular os segundos
        segundos=segundosTotaisAlbum-(horas*3600)-(minutos*60);

        System.out.println(horas+"h "+minutos+"m "+segundos+"s");
    }
}
