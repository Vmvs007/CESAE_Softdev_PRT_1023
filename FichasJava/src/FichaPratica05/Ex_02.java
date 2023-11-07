package FichaPratica05;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double[] comissoes = new double[12];
        double totalAnual=0;

        // Adicionar comissões a cada elemento do array
        for(int indice=0; indice<12 ; indice++){
            System.out.print("Insira um número no comissoes["+indice+"]: ");
            comissoes[indice] = input.nextDouble();
        }

        // Calcular o total anual
        for(int indice=0; indice<12 ; indice++){
            totalAnual=totalAnual+comissoes[indice];
        }

        // Apresentar o total anual
        System.out.println("Total Anual de Comissões: "+totalAnual);
    }
}
