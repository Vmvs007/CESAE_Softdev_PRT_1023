package Ex_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Jogador jogador=null;

        System.out.println("Bem-vindo à Aventura Mágica");

        System.out.print("Escolha o tipo de personagem (1. Cavaleiro)(2. Arqueiro)(3. Mago): ");
        int opcao= input.nextInt();

        switch (opcao){
            case 1:
                jogador = new Jogador("Vitor",new AtaqueEspada());
                break;

            case 2:

                break;

            case 3:
                jogador = new Jogador("Vitor",new AtaqueMagico());
                break;
        }

        System.out.println("Primeiro inimigo, encontras um ogre...");
        // Jogador ataca
        jogador.atacar();


        System.out.println("Continuas o caminho, e encontras um dragão");
        // Jogador ataca
        jogador.atacar();

        System.out.println("Chegas a um mosteiro com monges, que te podem ensinar novas artes de combate...");
        System.out.print("Escolhe um novo tipo de ataque ou mantem o mesmo (1. Cavaleiro)(2. Arqueiro)(3. Mago): ");
        opcao= input.nextInt();

        switch (opcao){
            case 1:
                jogador.setEstrategiaAtaque(new AtaqueEspada());
                break;

            case 2:
                break;

            case 3:
                jogador.setEstrategiaAtaque(new AtaqueMagico());
                break;
        }

        System.out.println("Continuas o caminho, e encontras um morcego");
        // Jogador ataca
        jogador.atacar();

        System.out.println("Boss final");
        // Jogador ataca
        jogador.atacar();

    }
}
