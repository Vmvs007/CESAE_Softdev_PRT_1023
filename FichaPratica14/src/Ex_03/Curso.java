package Ex_03;

import Ex_03.Entidades.Pessoa;
import Ex_03.Entidades.Professor;
import Ex_03.Enums.AreaFormacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private String nome;
    private ArrayList<DisciplinaCurso> planoCurricular;
    private boolean longaDuracao;

    public Curso(Escola escola) {

        this.planoCurricular = new ArrayList<>();

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        String nome;
        int quantidadeDisciplinas;
        int codDisciplina, codProfessor;

        System.out.println("***** Novo Curso *****");

        // Nome
        System.out.print("Nome: ");
        nome = input.nextLine();
        this.nome=nome;

        // Quantidade Disciplinas
        System.out.print("Quantidade Disciplinas: ");
        quantidadeDisciplinas = input.nextInt();

        // Ciclo para adicionar Disciplinas Curso
        for (int i = 0; i < quantidadeDisciplinas; i++) {
            escola.imprimirDisciplinas();
            System.out.print("Código Disciplina: ");
            codDisciplina = input.nextInt();
            codDisciplina--;

            Disciplina disciplina = escola.getListaDisciplinas().get(codDisciplina);

            ArrayList<Professor> professoresCompetentes = new ArrayList<>();

            // Ciclo para encontrar professores competentes
            for (Professor professorAtual : escola.getListaProfessores()) {
                for (AreaFormacao areaFormacaoAtual : professorAtual.getAreasFormacao()) {
                    if (areaFormacaoAtual.equals(disciplina.getArea())) {
                        professoresCompetentes.add(professorAtual);
                    }
                }
            }

            System.out.println("*** Professores Competentes ***");
            int contador = 1;
            for (Professor professorAtual : professoresCompetentes) {
                System.out.print(contador + ": ");
                professorAtual.exibirDetalhesMinimos();
            }

            System.out.print("Código Professor: ");
            codProfessor = input.nextInt();
            codProfessor--;

            Professor professor = professoresCompetentes.get(codProfessor);

            DisciplinaCurso disciplinaCurso = new DisciplinaCurso(disciplina,professor);
            this.planoCurricular.add(disciplinaCurso);

            // Longa duracao

            if(calcularDuracao()>100){
                this.longaDuracao=true;
            }else{
                this.longaDuracao=false;
            }
        }



    }

    public int calcularDuracao(){
        int duracaoTotal=0;

        for(DisciplinaCurso disciplinaCursoAtual: this.planoCurricular){
            duracaoTotal+=disciplinaCursoAtual.getDisciplina().getDuracaoHoras();
        }

        return duracaoTotal;
    }
}
