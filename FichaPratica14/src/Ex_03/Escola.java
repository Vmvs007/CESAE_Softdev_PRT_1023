package Ex_03;

import Ex_03.Entidades.Aluno;
import Ex_03.Entidades.Funcionario;
import Ex_03.Entidades.Pessoa;
import Ex_03.Entidades.Professor;
import Ex_03.Enums.AreaFormacao;

import java.util.ArrayList;

public class Escola {
    private String nome;
    private String localizacao;
    private int lotacaoMaxAlunos;
    private ArrayList<Professor> listaProfessores;
    private ArrayList<Disciplina> listaDisciplinas;
    private ArrayList<Curso> listaCursos;
    private ArrayList<Aluno> listaAlunos;
    private ArrayList<Funcionario> listaStaff;

    public Escola(String nome, String localizacao, int lotacaoMaxAlunos) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.lotacaoMaxAlunos = lotacaoMaxAlunos;
        this.listaProfessores = new ArrayList<>();
        this.listaDisciplinas = new ArrayList<>();
        this.listaCursos = new ArrayList<>();
        this.listaAlunos = new ArrayList<>();
        this.listaStaff = new ArrayList<>();
    }

    public void addProfessor(Professor professorNovo) {
        this.listaProfessores.add(professorNovo);
    }

    public void addDisciplinas(Disciplina disciplinaNova) {
        this.listaDisciplinas.add(disciplinaNova);
    }

    public void addCurso(Curso cursoNovo) {
        this.listaCursos.add(cursoNovo);
    }

    public void addAluno(Aluno alunoNovo) {
        this.listaAlunos.add(alunoNovo);
    }

    public void addStaff(Funcionario funcionarioNovo) {
        this.listaStaff.add(funcionarioNovo);
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public int getLotacaoMaxAlunos() {
        return lotacaoMaxAlunos;
    }

    public ArrayList<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public ArrayList<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public ArrayList<Funcionario> getListaStaff() {
        return listaStaff;
    }

    public void imprimirDisciplinas() {
        int contador = 1;
        System.out.println("*** Disciplinas ***");
        for (Disciplina disciplinaAtual : this.listaDisciplinas) {
            System.out.print(contador++ + ": ");
            disciplinaAtual.exibirDetalhes();
        }
        System.out.println();
    }

}
