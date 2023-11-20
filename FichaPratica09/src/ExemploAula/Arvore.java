package ExemploAula;

public class Arvore {
    private String especie;
    private boolean frutifera;
    private double altura;

    public Arvore(String especie, boolean frutifera, double altura) {
        this.especie = especie;
        this.frutifera = frutifera;
        this.altura = altura;
    }

    public String getEspecie() {
        return this.especie;
    }

    public double getAltura() {
        return this.altura;
    }

    public boolean isFrutifera() {
        return this.frutifera;
    }

    public void setFrutifera(boolean frutifera) {
        this.frutifera = frutifera;
    }
}
