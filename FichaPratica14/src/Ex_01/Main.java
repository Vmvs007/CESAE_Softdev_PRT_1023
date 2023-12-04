package Ex_01;

public class Main {
    public static void main(String[] args) {

        Retangulo terreno1 = new Retangulo("Preto",200,10);
        Retangulo terreno2 = new Retangulo("Castanho",20,40);

        Circulo terreno3 = new Circulo("Amarelo",10);

        Triangulo terreno4 = new Triangulo("Azul",10,5);

        GestorTerrenos gt = new GestorTerrenos("Vitor S.");
        gt.addTerreno(terreno1);
        gt.addTerreno(terreno2);
        gt.addTerreno(terreno3);
        gt.addTerreno(terreno4);

        System.out.println("Área Total dos Terrenos do "+gt.getProprietario()+": "+gt.calcularAreaTerrenos());
        System.out.println("Perímetro Total dos Terrenos do "+gt.getProprietario()+": "+gt.calcularPerimetroTerrenos());
    }
}
