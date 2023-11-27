package Ex_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mota extends Veiculo{
    public Mota(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double consumo) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, consumo);
    }

    public void imprimirImagem() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Mota.txt"));

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

    }
}
