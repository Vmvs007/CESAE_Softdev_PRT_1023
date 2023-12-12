package Ex_01;

import javax.swing.table.TableRowSorter;

public class Jogador {
    protected String nome;
    protected int vida=100;
    protected int nivel=0;
    protected EstrategiaAtaque estrategiaAtaque;

    public Jogador(String nome, EstrategiaAtaque estrategiaAtaque) {
        this.nome = nome;
        this.estrategiaAtaque = estrategiaAtaque;
    }


    public  void atacar(){
        this.estrategiaAtaque.atacar();
    }

    public void setEstrategiaAtaque(EstrategiaAtaque estrategiaAtaque) {
        this.estrategiaAtaque = estrategiaAtaque;
    }
}
