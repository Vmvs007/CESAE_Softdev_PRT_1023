package AirplaneStore;

import AirplaneStore.Enums.Arma;

import java.util.ArrayList;

public class AviaoCombate extends Aviao {
    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Arma> arsenal;

    public AviaoCombate(int serial, String modelo, int anoFabrico, double peso, double cmp_fuselagem, double env_asas, double alt_cauda, int n_motores, double autonomia, double velocidade_max, double preco, String paisOrigem, boolean camuflagem) {
        super(serial, modelo, anoFabrico, peso, cmp_fuselagem, env_asas, alt_cauda, n_motores, autonomia, velocidade_max, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.arsenal = new ArrayList<>();
    }

    public void addArma(Arma armaNova){
        if(this.arsenal.size()<3){
            this.arsenal.add(armaNova);
        }
    }

    public void removeArma(int index){
        this.arsenal.remove(index);
    }

    public void listarArsenal(){
        System.out.print("Arsenal: ");
        System.out.print(this.arsenal);
        System.out.println();
    }

    public void exibirDetalhesAviaoCombate(){
        super.exibirDetalhes();
        System.out.println("Pais Origem: "+this.paisOrigem);
        System.out.println("Camuflagem: "+this.camuflagem);
        this.listarArsenal();
        System.out.println();
    }
}
