package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) throws FileNotFoundException {

        File ficheiro = new File("Ficheiros/exercicio_10.csv");
        Scanner scanner = new Scanner(ficheiro);

        double total=0, quantidadeVendida, precoUnitario;

        // Linha do cabeçalho
        String linha = scanner.nextLine();

        while (scanner.hasNextLine()){
            linha = scanner.nextLine();
            String[] itensLinha = linha.split(",");

            quantidadeVendida=Double.parseDouble(itensLinha[2]);
            precoUnitario=Double.parseDouble(itensLinha[3]);

            total+=(quantidadeVendida*precoUnitario);
        }

        System.out.println("Total: "+total+" €");
    }
}
