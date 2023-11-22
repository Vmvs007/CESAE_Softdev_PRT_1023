package Ex_02;

public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta("123456789","Vitor S.");
        Conta conta2 = new Conta("987654321","Primo Suiça");


        conta1.exibirDetalhes();
        conta2.exibirDetalhes();

        conta1.depositar(1000);
        conta1.exibirDetalhes();
        conta2.exibirDetalhes();

        conta1.levantar(650);
        conta1.exibirDetalhes();
        conta2.exibirDetalhes();

        conta1.levantar(2500);
        conta1.exibirDetalhes();
        conta2.exibirDetalhes();

        conta1.transferencia(conta2, 300);
        conta1.exibirDetalhes();
        conta2.exibirDetalhes();

        conta1.transferencia(conta2, 4000);
        conta1.exibirDetalhes();
        conta2.exibirDetalhes();

        // Testar empréstimo
        conta1.depositar(950);
        conta1.exibirDetalhes();
        conta2.exibirDetalhes();

        conta1.emprestimo(3000);
        conta1.exibirDetalhes();
        conta2.exibirDetalhes();

        conta1.emprestimo(400);
        conta1.exibirDetalhes();
        conta2.exibirDetalhes();

        conta1.emprestimo(100);
        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
    }
}
