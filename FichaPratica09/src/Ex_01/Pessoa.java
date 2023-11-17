package Ex_01;

public class Pessoa {

    // Definir atributos de instância
    private String nome;
    private int idade;
    private double altura;

    /**
     * Método construtor de Pessoa
     * @param nome Nome da Pessoa
     * @param idade Idade da Pessoa
     * @param altura Altura da Pessoa (m.)
     */
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
