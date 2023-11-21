package Ex_09;

public class Main {
    public static void main(String[] args) {

        // Instanciar um produto
        Produto escova = new Produto("Escova Dentes",5);
        Produto atum = new Produto("Atum",1.99);

        escova.exibirDetalhes();

        // Comprar 100 escovas
        escova.comprar(100);

        escova.exibirDetalhes();

        escova.vender(60);

        escova.exibirDetalhes();

        escova.vender(70);

        escova.exibirDetalhes();

        escova.comprar(15);

        escova.exibirDetalhes();

    }
}
