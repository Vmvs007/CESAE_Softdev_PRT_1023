package Ex_03;

public class Main {
    public static void main(String[] args) {


        Animal macaco_Tobias = new Animal("Tobias", "Macaco", "Angola", 20, new String[]{"Couves","Milho","Bananas"});
        Animal girafa_Joaquina = new Animal("Joaquina","Girafa","Moçambique", 390, new String[]{"Cozido","Folhas","Enguia","BQQ","Palha"});

        macaco_Tobias.imprimirDetalhes();
        girafa_Joaquina.imprimirDetalhes();

        System.out.println("\n********************");

        macaco_Tobias.comer("Bananas",500);
        girafa_Joaquina.comer("Bananas", 800);

        System.out.println("********************");
        macaco_Tobias.imprimirDetalhes();
        girafa_Joaquina.imprimirDetalhes();



    }
}
