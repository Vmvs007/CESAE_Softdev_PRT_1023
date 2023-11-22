package Ex_03;

public class Animal {
    private String nome;
    private String especie;
    private String paisOrigem;
    private double peso;
    private String[] alimentacao;

    public Animal(String nome, String especie, String paisOrigem, double peso, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }

    public void comer(String alimento, double pesoAlimento) {

        for (int i = 0; i < this.alimentacao.length; i++) {
            if (this.alimentacao[i].equals(alimento)) {
                // Animal aceitou a comida
                // Aumentar o peso
                this.peso+=pesoAlimento/1000;
                System.out.println("O " + this.especie + " " + this.nome + " comeu " + alimento);
                return;
            }
        }

        System.out.println("O " + this.especie + " " + this.nome + " não comeu " + alimento);

    }

    public void imprimirDetalhes(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Especie: "+this.especie);
        System.out.println("Pais Origem: "+this.paisOrigem);
        System.out.println("Peso: "+this.peso);
        System.out.print("Dieta: ");

        for(int i = 0 ; i<this.alimentacao.length; i++){
            System.out.print(this.alimentacao[i]+" | ");
        }
        System.out.println("\n");
    }

}
