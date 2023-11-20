package Ex_04;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea(){
        return 3.1415*this.raio*this.raio;
    }

    public double calcularCircunferencia(){
        return 2*3.1415*this.raio;
    }
}
