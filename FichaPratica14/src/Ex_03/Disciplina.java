package Ex_03;

import Ex_03.Enums.AreaFormacao;

import java.util.Scanner;

public class Disciplina {
    private String nome;
    private AreaFormacao area;
    private int duracaoHoras;

    public Disciplina(String nome, AreaFormacao area, int duracaoHoras) {
        this.nome = nome;
        this.area = area;
        this.duracaoHoras = duracaoHoras;
    }

    /**
     * Método construtor a partir da consola
     */
    public Disciplina() {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        String nome;
        AreaFormacao area = null;
        int indexArea;
        int duracaoHoras;

        System.out.println("*** Nova Disciplina ***");

        // Nome
        System.out.print("Nome: ");
        nome = input.nextLine();

        // Area
        System.out.println("\nÁreas de Formação");
        int contador = 1;
        for (AreaFormacao areaFormacaoAtual : AreaFormacao.values()) {
            System.out.println(contador++ + ": " + areaFormacaoAtual);
        }

        System.out.print("\nÁrea de Formação: ");
        indexArea = input.nextInt();

        contador = 1;
        for (AreaFormacao areaFormacaoAtual : AreaFormacao.values()) {
            if (indexArea == contador) {
                area = areaFormacaoAtual;
            }
            contador++;
        }

        // Duracao
        System.out.print("Duração (h): ");
        duracaoHoras = input.nextInt();

        // Construir o objeto
        this.nome = nome;
        this.area = area;
        this.duracaoHoras = duracaoHoras;
    }

    public String getNome() {
        return nome;
    }

    public AreaFormacao getArea() {
        return area;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: "+this.nome+"\t| Área Formação: "+this.area+"\t| Duração: "+this.duracaoHoras+"h." );
    }
}
