package Ex_02;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Carro mercedesA45 = new Carro("Mercedes", "A45", 2023, 420, 2000, TipoCombustivel.GASOLINA, 15, 5);
        Carro mercedesEQB = new Carro("Mercedes", "EQB", 2022, 296, 4000, TipoCombustivel.ELETRICO, 1, 7);

        System.out.println("Viagem de 50Km para A45: " + mercedesA45.calcularCustoViagem(50) + "€");
        System.out.println("Viagem de 50Km para EQB: " + mercedesEQB.calcularCustoViagem(50) + "€");

        System.out.println("********************************************************************");

        Mota bmw = new Mota("BMW", "BMW 1500", 2010, 100, 1500, TipoCombustivel.GASOLINA, 7.5);
        bmw.imprimirImagem();

        System.out.println("********************************************************************");

        Camiao scania = new Camiao("Scania", "Truck", 2008, 500, 5000, 19, 2000);
        scania.viagem(50,1500);
        scania.viagem(50,2500);

        System.out.println("********************************************************************");
        // Corridas

        Veiculo vencedor1=mercedesA45.corrida(mercedesEQB);

        System.out.println("Vencedor: ");
        vencedor1.exibirDetalhes();

        System.out.println("********************************************************************");

        Veiculo vencedor2=bmw.corrida(scania);
        vencedor2.exibirDetalhes();

        System.out.println("********************************************************************");
    }
}
