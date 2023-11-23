package Ex_01;

import java.util.ArrayList;

public class MusicPlayer {

    private ArrayList<Musica> programacao;

    public MusicPlayer() {
        this.programacao = new ArrayList<>();
    }

    public void addMusica(Musica musicaNova) {
        this.programacao.add(musicaNova);
    }

    public void removeMusica(int index) {
        this.programacao.remove(index);
    }

    public void removeMusica(Musica musica) {
        this.programacao.remove(musica);
    }

    public void trocarMusicas(int index1, int index2) {
        Musica musica1 = this.programacao.get(index1);
        Musica musica2 = this.programacao.get(index2);

        this.programacao.set(index1, musica2);
        this.programacao.set(index2, musica1);
    }

    public void imprimirRelatorio() {
        int contador = 1;

        // Ciclo for each
        // Grava em "musicaAtual" uma posição do array "programação", de cada vez (a cada iteração)
        for (Musica musicaAtual : this.programacao) {
            System.out.print("Música " + contador++ + ": ");
            musicaAtual.exibirDetalhes();
        }
    }

    public void imprimirRelatorioTradicional(){

        // Usar ciclo for como estamos habituados
        for(int i = 0 ; i< this.programacao.size(); i++){
            Musica musicaAtual = this.programacao.get(i);
            System.out.print("Música "+ (i+1)+": ");
            musicaAtual.exibirDetalhes();
        }
    }


}
