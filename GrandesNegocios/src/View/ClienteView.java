package View;

import java.util.Scanner;

public class ClienteView {
    public ClienteView() {
    }

    public void menuCliente() {
        Scanner input = new Scanner(System.in);

        int opcao = 0;

        System.out.println("\n********** Bem-Vindo/a Cliente **********");
        System.out.println("1. Consultar Produtos Disponiveis");
        System.out.println("2. Consultar Produtos");
        System.out.println("3. Consultar Produtos Mais Barato");
        System.out.println("4. Consultar Produtos Mais Caro");
        System.out.println("0. Sair");
        System.out.print("Selecione uma opção: ");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("");
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

            case 0:
                break;


        }
    }
}
