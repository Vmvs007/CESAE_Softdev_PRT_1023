package ExemploAula;

public class Animal {
    private String nome;
    private String especie;
    private String barulho;
    private int idade;
    private double altura;
    private double peso;

    public Animal(String nome, String especie, String barulho, int idade, double altura, double peso) {
        this.nome = nome;
        this.especie = especie;
        this.barulho = barulho;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public void fazerBarulho(){
        System.out.println(this.barulho);
    }

    public void fazerBarulho(int vezes){
        for(int i=0; i<vezes;i++){
            System.out.println(this.barulho);
        }
    }

    public void treparArvore(Arvore arvore){
        if(this.altura>(arvore.getAltura()-10)){
            System.out.println(this.nome + " trepou uma "+ arvore.getEspecie());
        }else{
            System.out.println("Animal não conseguiu trepar");
        }
    }

    public void comerFruta(Arvore arvore){
        if(arvore.isFrutifera()){
            // Animal vai comer
            this.peso+=0.1; // this.peso = this.peso + 0.1;
            arvore.setFrutifera(false);
            System.out.println(this.nome + " conseguiu comer os frutos todos da "+arvore.getEspecie());
        }else{
            // Animal não vai comer
            System.out.println(this.nome +" não consegue comer pois "+arvore.getEspecie()+" não tem fruto.");
        }
    }

    public void marretada(Animal animalAgredido){
        System.out.println(this.nome + " mandou uma marretada no "+animalAgredido.nome);
        animalAgredido.altura-=0.1;
    }

}
