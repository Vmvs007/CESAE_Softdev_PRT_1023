package Ex_02;

public class Main {
    public static void main(String[] args) {

        Cao bobby = new Cao("Bobby","Beagle");
        Cao max = new Cao("Max", "Pastor Alemão");
        Cao fido = new Cao("Fido", "Salcicha");

        bobby.ladrar();
        max.ladrar();
        fido.ladrar();

        fido.setLatido("Ruffff!");

        System.out.println();

        bobby.ladrar();
        max.ladrar();
        fido.ladrar();
    }
}
