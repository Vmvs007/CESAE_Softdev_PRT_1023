package Ex_02;

public class Conta {
    private String numeroConta;
    private double saldo = 0;
    private String titular;
    private int anoAbertura = 2023;
    private double margemEmprestimo = 0.9;
    private double divida = 0;


    public Conta(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public void depositar(double valor) {
        System.out.println("Depositado: " + valor);
        this.saldo += valor;
    }

    public void levantar(double valor) {
        if (this.saldo >= valor) {
            System.out.println("Levantamento Efetuado: " + valor);
            this.saldo -= valor;
        } else {
            System.out.println("Vai trabalhar");
        }
    }

    public void transferencia(Conta destinatario, double valor) {
        if (this.saldo >= valor) { // Transferencia valida
            System.out.println("Dinheiro Transferido: " + valor);
            this.saldo -= valor;
            destinatario.saldo += valor;
        } else { // Transferencia invalida
            System.out.println("Vai trabalhar. Não tens esse dinheiro para transferir");
        }
    }

    public boolean emprestimo(double valorPedir) {

        if (divida == 0 && this.margemEmprestimo * this.saldo >= valorPedir) { // Pode pedir
            this.saldo+=valorPedir;
            this.divida=valorPedir;
            System.out.println("Empréstimo concedido.");
            return true;
        }else{ // Recusar emprestimo
            System.out.println("Empréstimo de "+valorPedir+" recusado!");
            return false;
        }
    }

    public void exibirDetalhes() {
        System.out.println("Numero Conta: " + this.numeroConta + "\t| Titular: " + this.titular + "\t| Saldo: " + this.saldo + "€");
    }
}
