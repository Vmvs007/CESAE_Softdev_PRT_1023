package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) throws FileNotFoundException {

        File ficheiro = new File("Ficheiros/exercicio_05_1999.txt");
        Scanner maquinaLer = new Scanner(ficheiro);

        int numAtual, soma=0;

        // Enquanto o ficheiro tiver um número para a frente
        while (maquinaLer.hasNextInt()){
            // Gravar esse número em "numAtual"
            numAtual=maquinaLer.nextInt();

            // Incrementar à "soma" o "numAtual"
            soma+=numAtual;
        }

        System.out.println("Soma: "+soma);
    }
}
