package Pizzaria.Ingredientes;

import Pizzaria.Enums.UnidadeMedida;

public class Ingrediente {

    private String codigo;
    private String nome;
    private UnidadeMedida medidaIngrediente;
    private double kcalUnidadeMedida;

    public Ingrediente(String codigo, String nome, UnidadeMedida medidaIngrediente, double kcalUnidadeMedida) {
        this.codigo = codigo;
        this.nome = nome;
        this.medidaIngrediente = medidaIngrediente;
        this.kcalUnidadeMedida = kcalUnidadeMedida;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public UnidadeMedida getMedidaIngrediente() {
        return medidaIngrediente;
    }

    public double getKcalUnidadeMedida() {
        return kcalUnidadeMedida;
    }

    public void exibirDetalhes() {
        System.out.print("[" + this.codigo + " | " + this.nome + " | " + this.medidaIngrediente + " | " + this.kcalUnidadeMedida + " Kcal]");
    }
}
