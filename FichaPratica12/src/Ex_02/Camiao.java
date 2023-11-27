package Ex_02;

public class Camiao extends Veiculo {

    private double capacidadeCarga;

    public Camiao(String marca, String modelo, int anoFabrico, int potencia, int cilindrada,  double consumo, double capacidadeCarga) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, TipoCombustivel.DIESEL, consumo);
        this.capacidadeCarga = capacidadeCarga;
    }

    public boolean viagem(double distancia, double carga) { // 50, 1500
        double diesel = 1.95;

        if (carga > this.capacidadeCarga) { // Muito pesado
            System.out.println("Carga: "+carga+"Kg. muito pesada. Capacidade Máxima: "+this.capacidadeCarga+"Kg.");
            return false;
        } else { // Tem capacidade para a viagem
            double litrosConsumidos = calcularConsumo(distancia);
            double litrosExtra = carga / 1000;
            litrosConsumidos += litrosExtra;

            double valorViagem = litrosConsumidos * diesel;

            System.out.println("Consumo: "+litrosConsumidos+"L");
            System.out.println("Valor: "+valorViagem+"€");

            return true;
        }
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade Carga: "+this.capacidadeCarga+" Kg.");
    }
}
