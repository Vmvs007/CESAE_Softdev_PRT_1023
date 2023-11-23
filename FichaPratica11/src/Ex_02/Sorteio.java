package Ex_02;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    private double premio;
    private ArrayList<Pessoa> participantes;

    public Sorteio(double premio) {
        this.premio = premio;
        this.participantes = new ArrayList<>();
    }

    public void addParticipante(Pessoa novoInscrito) {
        if (novoInscrito.getIdade() >= 18) { // Pode estar inscrito
            System.out.println("Participante " + novoInscrito.getNome() + ": Inscrito com sucesso.");
            this.participantes.add(novoInscrito);
        } else { // É menor de idade, não se pode inscrever;
            System.out.println("Participante " + novoInscrito.getNome() + ": Inscrição Recusada. Menor de idade: " + novoInscrito.getIdade());
        }
    }

    public void imprimirListaParticipantes() {
        int contador = 1;

        System.out.println("***** Lista de Participantes *****");
        for (Pessoa pessoaAtual : this.participantes) {
            System.out.print("Participante " + contador++ + ": ");
            pessoaAtual.exibirDetalhes();
        }

    }

    public Pessoa sorteio(){
        Random random = new Random();
        
        int indexVencedor;

        indexVencedor=random.nextInt(0,this.participantes.size());

        return this.participantes.get(indexVencedor);
    }

}
