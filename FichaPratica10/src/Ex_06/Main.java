package Ex_06;

public class Main {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Vitor S.", "K1", 1.7, 65, "Portugal");
        Atleta atleta2 = new Atleta("Maria T.", "Ciclismo", 1.5, 50, "Espanha");
        Atleta atleta3 = new Atleta("Cristiano Ronaldo", "Futebol", 1.85, 70, "Portugal");

        Competicao futebolAmador = new Competicao("Liga Solteiros vs Casados", "Portugal");

        futebolAmador.inscreverAtleta(atleta1);
        futebolAmador.inscreverAtleta(atleta2);
        futebolAmador.inscreverAtleta(atleta3);

        futebolAmador.imprimirCompeticao();
    }
}
