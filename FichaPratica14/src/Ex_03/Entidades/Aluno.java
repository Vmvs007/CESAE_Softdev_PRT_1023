package Ex_03.Entidades;

import Ex_03.Curso;

public class Aluno extends Pessoa{
    private Curso curso;
    private double mediaNotas;

    private String[][] pauta;

    public Aluno(String nome, int anoNascimento, String email, String telemovel, Curso curso, double mediaNotas) {
        super(nome, anoNascimento, email, telemovel);
        this.curso = curso;
        this.mediaNotas = mediaNotas;
        this.pauta=new String[10][2]; // TODO: Falta o número de disciplinas para controlar o nº de linhas da pauta
    }

    @Override
    public void obterFuncao() {

    }

    @Override
    public void imprimirHorario() {

    }
}
