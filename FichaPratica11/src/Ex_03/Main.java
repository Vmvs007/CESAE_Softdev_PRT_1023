package Ex_03;

public class Main {
    public static void main(String[] args) {

        // Instanciar peixe
        Peixe atum = new Peixe("Atum", 20.5,15);
        Peixe robalo = new Peixe("Robalo", 7,20);
        Peixe sardinha = new Peixe("Sardinha", 0.2,7.99);
        Peixe faneca= new Peixe("Faneca", 0.3,8.99);
        Peixe peixeEspada = new Peixe("Peixe Espada", 30,25);
        Peixe bacalhau = new Peixe("Bacalhau Noruega", 22,19.90);

        // Instanciar o marisco
        Marisco ameijoa = new Marisco("Ameijoa", 30, 40);
        Marisco lagosta = new Marisco("Lagosta", 10,100);
        Marisco sapateira = new Marisco("Sapateira", 50,85);
        Marisco camarao = new Marisco("Camarao Tigre", 30,120);

        // Instanciar Barco
        BarcoPesca filhoMar = new BarcoPesca("Filho Mar", "Azul e Branco",1999,4,100,Marca.VORAZ);

        filhoMar.pescarPeixe(atum);
        filhoMar.pescarPeixe(robalo);
        filhoMar.pescarPeixe(sardinha);
        filhoMar.pescarPeixe(sardinha);
        filhoMar.pescarPeixe(sardinha);

        filhoMar.pescarMarisco(camarao);
        filhoMar.pescarMarisco(lagosta);
        filhoMar.pescarMarisco(sapateira);

        filhoMar.pescarPeixe(bacalhau);
        filhoMar.pescarPeixe(peixeEspada);
        filhoMar.pescarPeixe(faneca);

        filhoMar.largarPeixe(0);

        filhoMar.pescarMarisco(ameijoa);
        filhoMar.pescarMarisco(ameijoa);

        System.out.println("\nPreço Atual: "+filhoMar.calcularPrecoTotal()+" €");

        System.out.println("Salário p/ Tripulante: "+filhoMar.salarioTripulacao()+" €");
    }
}
