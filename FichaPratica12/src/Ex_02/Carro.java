package Ex_02;

public class Carro extends Veiculo{

    private int quantidadePassageiros;

    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double consumo, int quantidadePassageiros) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, consumo);
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public double calcularCustoViagem(int distancia){
        double gasolina=2.1, diesel=1.95, gpl=1.15, eletrico=0.12;

        double valorViagem=0;
        double litrosConsumidos = this.calcularConsumo(distancia);

        switch (this.getTipoCombustivel()){
            case GASOLINA:
                valorViagem=litrosConsumidos*gasolina;
                break;

            case DIESEL:
                valorViagem=litrosConsumidos*diesel;
                break;

            case GPL:
                valorViagem=litrosConsumidos*gpl;
                break;

            case ELETRICO:
                valorViagem=litrosConsumidos*eletrico;
                break;
        }

        return valorViagem;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Nº Passageiros: "+this.quantidadePassageiros);
    }
}
