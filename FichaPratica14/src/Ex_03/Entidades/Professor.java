package Ex_03.Entidades;

import Ex_03.Enums.AreaFormacao;

import java.util.ArrayList;

public class Professor extends Pessoa{
    private ArrayList<AreaFormacao> areasFormacao;
    private int nivelAcademico;

    public Professor(String nome, int anoNascimento, String email, String telemovel, int nivelAcademico) {
        super(nome, anoNascimento, email, telemovel);
        this.nivelAcademico = nivelAcademico;
        this.areasFormacao= new ArrayList<>();
    }

    public ArrayList<AreaFormacao> getAreasFormacao() {
        return areasFormacao;
    }

    public int getNivelAcademico() {
        return nivelAcademico;
    }

    @Override
    public void obterFuncao() {

    }

    @Override
    public void imprimirHorario() {

    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();

    }

    public void exibirDetalhesMinimos(){
        System.out.print(super.getNome()+"\t| Nivel Academico: "+this.nivelAcademico);
    }

}
