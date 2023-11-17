package Ex_03;

public class Retangulo {

    private double largura;
    private double altura;

    /**
     * Método construtor de Retângulo
     *
     * @param largura Largura (cm.)
     * @param altura  Altura (cm.)
     */
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return this.largura * this.altura;
    }

    public double calcularPerimetro() {
        return (this.largura * 2) + (this.altura * 2);
    }
}
