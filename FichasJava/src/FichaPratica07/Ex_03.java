package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) throws FileNotFoundException {

        // Trazer os ficheiros para o programa
        File ficheiroOriginal = new File("Ficheiros/exercicio_03_Alternativa01.txt");
        File ficheiroNovo = new File("Ficheiros/exercicio_03_copia.txt");

        // Scanner - máquina de ler
        Scanner maquinaLer = new Scanner(ficheiroOriginal);

        // Printwritter - máquina de escrever
        PrintWriter maquinaEscrever = new PrintWriter(ficheiroNovo);

        String linhaAtual;

        while (maquinaLer.hasNextLine()){
            linhaAtual=maquinaLer.nextLine();
            maquinaEscrever.println(linhaAtual);
        }

        maquinaEscrever.close();

    }
}
