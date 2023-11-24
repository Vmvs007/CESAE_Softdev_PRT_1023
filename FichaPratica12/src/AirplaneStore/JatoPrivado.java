package AirplaneStore;


import AirplaneStore.Enums.CategoriaJato;
import AirplaneStore.Enums.Instalacao;

import java.util.ArrayList;

public class JatoPrivado extends Aviao {

    private int lotacao;
    private double capacidade_bagagem;
    private CategoriaJato categoria;
    private ArrayList<Instalacao> instalacoes;

    public JatoPrivado(int serial, String modelo, int anoFabrico, double peso, double cmp_fuselagem, double env_asas, double alt_cauda, int n_motores, double autonomia, double velocidade_max, double preco, int lotacao, double capacidade_bagagem, CategoriaJato categoria) {
        super(serial, modelo, anoFabrico, peso, cmp_fuselagem, env_asas, alt_cauda, n_motores, autonomia, velocidade_max, preco);
        this.lotacao = lotacao;
        this.capacidade_bagagem = capacidade_bagagem;
        this.categoria = categoria;
        this.instalacoes = new ArrayList<>();
    }

    public void addInstalacao(Instalacao instalacaoNova) {
        this.instalacoes.add(instalacaoNova);
    }

    public void removeInstalacao(int index) {
        this.instalacoes.remove(index);
    }

    public void listarInstalacoes() {
        System.out.print("Instalações: ");
        System.out.print(this.instalacoes);
        System.out.println();
    }

    public void exibirDetalhesJatoPrivado() {
        super.exibirDetalhes();
        System.out.println("Lotação: " + this.lotacao);
        System.out.println("Categoria: " + this.categoria);
        this.listarInstalacoes();
        System.out.println();
    }
}
