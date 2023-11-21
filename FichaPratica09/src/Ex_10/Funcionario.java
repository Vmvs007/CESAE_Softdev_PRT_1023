package Ex_10;

public class Funcionario {
    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Salário: "+this.salario+ "€");
        System.out.println("Departamento: "+this.departamento+"\n");
    }

    public void aumentarSalario(double percentagemAumento){
        this.salario= this.salario*(1+(percentagemAumento/100));

        // this.salario+=this.salario*(percentagemAumento/100);
    }
}
