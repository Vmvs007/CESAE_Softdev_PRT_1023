package AirplaneStore;

public class Aviao {
    private int serial;
    private String modelo;
    private int anoFabrico;
    private double peso;
    private double cmp_fuselagem;
    private double env_asas;
    private double alt_cauda;
    private int n_motores;
    private double autonomia;
    private double velocidade_max;
    private double preco;

    public Aviao(int serial, String modelo, int anoFabrico, double peso, double cmp_fuselagem, double env_asas, double alt_cauda, int n_motores, double autonomia, double velocidade_max, double preco) {
        this.serial = serial;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.cmp_fuselagem = cmp_fuselagem;
        this.env_asas = env_asas;
        this.alt_cauda = alt_cauda;
        this.n_motores = n_motores;
        this.autonomia = autonomia;
        this.velocidade_max = velocidade_max;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }


    public void exibirDetalhes() {
        System.out.println("**** " + this.modelo + " ****");
        System.out.println("Serial: " + this.serial);
        System.out.println("Ano Fabrico: " + this.anoFabrico);
        System.out.println("Nº Motores: "+this.n_motores);
        System.out.println("Autonomia: "+this.autonomia+" Km.");
        System.out.println("Vel. Máx.: "+this.velocidade_max+" Km/h");
        System.out.println("Preço: "+this.preco+"€");
    }
}
