package Ex_03;

import java.util.ArrayList;

public class BarcoPesca {
    private String nome;
    private String cor;
    private int anoFabrico;
    private int tripulacao;
    private double capacidadeCarga;
    private Marca marcaBarco;
    private ArrayList<Peixe> peixesPescados;
    private ArrayList<Marisco> mariscoPescado;

    public BarcoPesca(String nome, String cor, int anoFabrico, int tripulacao, double capacidadeCarga, Marca marcaBarco) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.marcaBarco = marcaBarco;
        this.peixesPescados = new ArrayList<>();
        this.mariscoPescado = new ArrayList<>();
    }

    public double getCargaAtual() {
        double cargaAtual = 0;

        for (Peixe peixeAtual : this.peixesPescados) {
            cargaAtual += peixeAtual.getPeso();
        }

        for (Marisco mariscoAtual : this.mariscoPescado) {
            cargaAtual += mariscoAtual.getPeso();
        }

        /*
        for (int i = 0; i < this.peixesPescados.size(); i++) {
            Peixe peixeAtual = this.peixesPescados.get(i);
            cargaAtual += peixeAtual.getPeso();
        }

        for (int i = 0; i < this.mariscoPescado.size(); i++) {
            Marisco mariscoAtual = this.mariscoPescado.get(i);
            cargaAtual += mariscoAtual.getPeso();
        }
        */

        return cargaAtual;
    }


    public void pescarPeixe(Peixe peixeNovo) {
        if (peixeNovo.getPeso() + this.getCargaAtual() > this.capacidadeCarga) {
            // O Peso do PeixeNovo mais a cargar atual ultrapassam a capacidade carga
            System.out.println("Barco sem capacidade de carga: "+this.getCargaAtual());
            System.out.println(peixeNovo.getPeso()+"Kg. de "+peixeNovo.getEspecie()+" não adicionados");
        } else {
            System.out.println(peixeNovo.getEspecie()+" adicionado");
            this.peixesPescados.add(peixeNovo);
        }
    }

    public void pescarMarisco(Marisco mariscoNovo) {
        if (mariscoNovo.getPeso() + this.getCargaAtual() > this.capacidadeCarga) {
            // O Peso do MariscoNovo mais a cargar atual ultrapassam a capacidade carga
            System.out.println("Barco sem capacidade de carga: "+this.getCargaAtual());
            System.out.println(mariscoNovo.getPeso()+"Kg. de "+mariscoNovo.getEspecie()+" não adicionados");
        } else {
            System.out.println(mariscoNovo.getEspecie()+" adicionado");
            this.mariscoPescado.add(mariscoNovo);
        }
    }

    public void largarPeixe(int index) {
        this.peixesPescados.remove(index);
    }

    public void largarMarisco(int index) {
        this.mariscoPescado.remove(index);
    }

    public double calcularPrecoTotal(){
        double precoTotal=0;

        for(Peixe peixeAtual : this.peixesPescados){
            double precoPeixeAtual = peixeAtual.getPeso()*peixeAtual.getPrecoKg();
            precoTotal+=precoPeixeAtual;
        }

        for(Marisco mariscoAtual : this.mariscoPescado){
            double precoMariscoAtual = mariscoAtual.getPeso()*mariscoAtual.getPrecoKg();
            precoTotal+=precoMariscoAtual;
        }

        return precoTotal;
    }


    public double salarioTripulacao(){
        double salario= this.calcularPrecoTotal();

        // Tirar 40% para o capitão
        salario=salario*0.6;

        return salario/this.tripulacao;
    }
}
