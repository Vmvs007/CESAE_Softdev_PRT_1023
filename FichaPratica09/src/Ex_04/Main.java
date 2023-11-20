package Ex_04;

public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(10);

        System.out.println("Perimetro: "+ circulo1.calcularCircunferencia());
        System.out.println("Area: "+circulo1.calcularArea());
    }
}
