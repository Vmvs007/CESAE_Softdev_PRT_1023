package FichaPratica04;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao;

        do{
            // Apresentar opções do menu
            System.out.println("\n1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");

            // Ler opção
            System.out.print("Insira a opção: ");
            opcao=input.nextInt();

            switch (opcao){
                case 1: // Criar
                    System.out.println("***** Criar *****");
                    break;

                case 2: // Atualizar
                    System.out.println("***** Atualizar *****");
                    break;

                case 3: // Eliminar
                    System.out.println("***** Eliminar *****");
                    break;

                case 4: // Sair
                    System.out.println("***** Sair *****");
                    break;

                default: // Opção Inválida
                    System.out.println("Opção Inválida!");
            }

        }while (opcao!=4);
    }
}
