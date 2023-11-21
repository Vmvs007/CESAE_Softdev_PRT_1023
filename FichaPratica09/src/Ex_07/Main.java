package Ex_07;

public class Main {
    public static void main(String[] args) {

        // Instanciar livros
        Livro songOfIceAndFire = new Livro("A Song of Ice and Fire", "R.R. Martin", "Fantasia", 500, "123456789");
        Livro biblia = new Livro("Biblia Sagrada","Jesus", "Religiao",360,"1");

        songOfIceAndFire.exibirDetalhes();

        biblia.exibirDetalhes();
    }
}
