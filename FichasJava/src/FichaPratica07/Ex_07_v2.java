package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07_v2 {
    public static void main(String[] args) throws FileNotFoundException {

        File ficheiro = new File("Ficheiros/exercicio_07.txt");

        Scanner scanner = new Scanner(ficheiro);

        int contadorLinhas=0, contadorPalavras=0;
        String linha;

        while (scanner.hasNextLine()){
            linha=scanner.nextLine();
            String[] itensLinha = linha.split(" ");

            contadorPalavras+=itensLinha.length;
            contadorLinhas++;

        }


        System.out.println("Linhas: "+contadorLinhas);
        System.out.println("Palavras: "+contadorPalavras);

    }
}
