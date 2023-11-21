package Ex_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira a marca: ");
        String marca = input.next();

        System.out.print("Insira o modelo: ");
        String modelo = input.next();

        System.out.print("Insira o ano: ");
        int ano = input.nextInt();

        System.out.print("Insira a potencia: ");
        int potencia= input.nextInt();

        System.out.print("Insira a cilindrada: ");
        int cilindrada = input.nextInt();

        System.out.print("Insira o Tipo de Combustivel (GASOLINA, DIESEL, GPL): ");
        String escolhaCombustivel = input.next();

        TipoCombustivel tipoCombustivel= null;
        switch (escolhaCombustivel){
            case "GASOLINA":
                tipoCombustivel=TipoCombustivel.GASOLINA;
                break;

            case "DIESEL":
                tipoCombustivel=TipoCombustivel.DIESEL;
                break;

            case "GPL":
                tipoCombustivel=TipoCombustivel.GPL;
                break;
        }

        System.out.print("Insira o consumo (L/100Km): ");
        double consumo = input.nextDouble();

        Carro carroUtilizador = new Carro(marca,modelo,ano,potencia,cilindrada,tipoCombustivel,consumo);
        Carro mercedesA45 = new Carro("Mercedes", "A45", 2023, 420, 2000, TipoCombustivel.GASOLINA, 12);
        Carro datsun = new Carro("Datsun", "1200", 1970, 90, 1200, TipoCombustivel.GASOLINA, 25);
        Carro ferrari = new Carro("Ferrari", "SF90", 2023, 800, 5000, TipoCombustivel.GASOLINA, 18);

        //mercedesA45.ligar();
        //datsun.ligar();

        /*
        System.out.println("Peguei no meu carro: "+ibiza.getMarca()+" "+ibiza.getModelo());
        ibiza.ligar();

        System.out.println("Fui ao mecanico carregar o "+ibiza.getMarca());
        ibiza.setPotencia(500);

        System.out.println("Peguei no meu carro: "+ibiza.getMarca()+" "+ibiza.getModelo());
        ibiza.ligar();
        */

        /*
        Carro vencedor = mercedesA45.corrida(ibiza);
        System.out.println("**** Vencedor ****");
        if (vencedor == null) {
            System.out.println("Empate");
        } else {
            vencedor.exibirDetalhes();
        }
        */

        Carro vencedorCorrida1 = mercedesA45.corrida(datsun);
        Carro vencedorCorrida2 = carroUtilizador.corrida(ferrari);

        Carro vencedorFinal = vencedorCorrida1.corrida(vencedorCorrida2);
        System.out.println("Vencedor Final");
        vencedorFinal.exibirDetalhes();

    }
}
