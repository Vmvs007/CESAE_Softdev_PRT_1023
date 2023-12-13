package View;

import java.util.Scanner;

public class AdministradorView {

    public AdministradorView() {
    }

    public static void menuAdmin() {
        Scanner input = new Scanner(System.in);

        int opcao = 0;

        do {


            System.out.println("\n********** Bem-Vindo/a Administrador **********");
            System.out.println("1. Analisar qual o produto que vendeu mais unidades");
            System.out.println("2. Analisar qual o produto que gerou mais valor de vendas");
            System.out.println("3. Consultar qual a venda que vendeu mais unidades");
            System.out.println("4. Consultar qual a venda que vendeu mais valor");
            System.out.println("5. Obter o total de todas as vendas");
            System.out.println("6. Obter a média de todas as vendas");
            System.out.println("0. Sair");
            System.out.print("Selecione uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n*** Analisar qual o produto que vendeu mais unidades ***\n");
                    break;

                case 2:
                    System.out.println("\n*** Analisar qual o produto que gerou mais valor de vendas ***\n");
                    break;

                case 3:
                    System.out.println("\n*** Consultar qual a venda que vendeu mais unidades ***\n");
                    break;

                case 4:
                    System.out.println("\n*** Consultar qual a venda que vendeu mais valor ***\n");
                    break;

                case 5:
                    System.out.println("\n*** Obter o total de todas as vendas ***\n");
                    break;

                case 6:
                    System.out.println("\n*** Obter a média de todas as vendas ***\n");
                    break;

                case 0:
                    System.out.println("\n*** Voltar... ***\n");
                    break;


            }

        }while(opcao!=0);

    }
}
