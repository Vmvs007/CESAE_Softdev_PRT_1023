package Ex_02;

public class Main {
    public static void main(String[] args) {

        // Instanciar pessoas
        Pessoa pessoa1 = new Pessoa("Vitor S.",24,"911222333","vmvs007@gmail.com");
        Pessoa pessoa2 = new Pessoa("Cristiano Ronaldo",38,"955666777", "cr7@gmail.com");
        Pessoa pessoa3= new Pessoa("Albert Einstein", 12, "911222222", "emc2@gmail.com");
        Pessoa pessoa4= new Pessoa("Ana Malhoa", 30, "965888999","ana.malhoa@gmail.com");
        Pessoa pessoa5 = new Pessoa("Amalia Rodrigues", 70, "980888999","fadinho@gmail.com");

        // Instanciar sorteio
        Sorteio euromilhoes = new Sorteio(17000000);

        euromilhoes.addParticipante(pessoa1);
        euromilhoes.addParticipante(pessoa2);
        euromilhoes.addParticipante(pessoa3);
        euromilhoes.addParticipante(pessoa4);
        euromilhoes.addParticipante(pessoa5);

        System.out.println();

        euromilhoes.imprimirListaParticipantes();

        System.out.println("\n****** Grande Vencedor ******");
        Pessoa vencedor = euromilhoes.sorteio();
        vencedor.exibirDetalhes();

    }
}
