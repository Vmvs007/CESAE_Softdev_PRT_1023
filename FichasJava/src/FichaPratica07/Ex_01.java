package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.BibliotecaFicheiros.*;

public class Ex_01 {

    public static void main(String[] args) throws FileNotFoundException {

        /*Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_01_Alternativa02.txt"));

        String linha;

        while (fileScanner.hasNextLine()) {
            linha = fileScanner.nextLine();
            System.out.println(linha);
        }*/

        imprimirFicheiro("Ficheiros/exercicio_01.txt");
        imprimirFicheiro("Ficheiros/exercicio_01_Alternativa01.txt");
        imprimirFicheiro("Ficheiros/exercicio_01_Alternativa02.txt");


    }
}
