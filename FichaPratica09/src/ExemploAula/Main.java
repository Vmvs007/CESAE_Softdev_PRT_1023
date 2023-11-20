package ExemploAula;

public class Main {
    public static void main(String[] args) {

        Arvore palmeira = new Arvore("Palmeira",false,12.5);
        Arvore bananeira = new Arvore("Bananeira",true,2);

        Animal macaco = new Animal("Macaco Adriano","Babuino","Uhhhhh ahhh",4,1.2,38);
        Animal gorila = new Animal("Bono", "Gorila","Uhhhhhhhhh",12,3.1,500);
        Animal cao = new Animal("Max", "Cão Pastor Alemão","Au au au ", 4,0.9,58);

        macaco.fazerBarulho();
        cao.fazerBarulho();

        gorila.fazerBarulho(5);

        System.out.println("\n");

        macaco.treparArvore(palmeira);
        macaco.treparArvore(bananeira);

        System.out.println("\n");

        macaco.comerFruta(palmeira);
        macaco.comerFruta(bananeira);

        gorila.comerFruta(bananeira);

        System.out.println("\n");

        System.out.println("Altura "+macaco.getNome()+": "+macaco.getAltura()+" m.");
        gorila.marretada(macaco);
        System.out.println("Altura "+macaco.getNome()+": "+macaco.getAltura()+" m.");

    }
}
