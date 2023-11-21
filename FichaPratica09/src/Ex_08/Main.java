package Ex_08;

public class Main {
    public static void main(String[] args) {
        Aluno vitor = new Aluno("Vitor",24,"Software Engineer",15);
        System.out.println(vitor.situacao());

        Aluno joaquim = new Aluno("Quim",40,"Data SA", 5);
        System.out.println(joaquim.situacao());
    }
}
