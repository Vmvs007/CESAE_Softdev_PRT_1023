package View;

import java.util.Scanner;

public class FuncionarioView {
    public FuncionarioView() {
    }

    public static void menuFuncionario() {
        Scanner input = new Scanner(System.in);

        int opcao = 0;

        do {


            System.out.println("\n********** Bem-Vindo/a Funcionario **********");
            System.out.println("1. Adicionar nova venda");
            System.out.println("2. Consultar stock de um determinado produto");
            System.out.println("0. Sair");
            System.out.print("Selecione uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n*** Adicionar nova venda ***\n");
                    break;

                case 2:
                    System.out.println("\n*** Consultar stock de um determinado produto ***\n");
                    break;

                case 0:
                    System.out.println("\n*** Voltar... ***\n");
                    break;


            }

        }while(opcao!=0);

    }
}
