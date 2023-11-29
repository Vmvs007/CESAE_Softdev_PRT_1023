package Pizzaria;

import Pizzaria.Enums.BasePizza;
import Pizzaria.Enums.TamanhoPizza;
import Pizzaria.Ingredientes.*;

import java.util.ArrayList;

public class Pizza {

    private String codigo;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizza tamanho;
    private ArrayList<IngredientePizza> composicao;

    public Pizza(String codigo, String nome, String descricao, double preco, TamanhoPizza tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.composicao = new ArrayList<>();
    }

    /**
     * Método para adicionar IngredientePizza à Pizza (num máximo de 5)
     *
     * @param ingredientePizzaNovo IngredientePizza a adicionar
     */
    public void addIngredientePizza(IngredientePizza ingredientePizzaNovo) {

        // Condição para avaliar se o primeiro elemento a ser inserido é Base
        if (this.composicao.size() == 0 && ingredientePizzaNovo.getIngrediente() instanceof Base) {
            this.composicao.add(ingredientePizzaNovo);
        }

        // Condição para avaliar se o todos os elementos que não o primeiro são do tipo Topping
        if (this.composicao.size() > 0 && this.composicao.size() < 5 && ingredientePizzaNovo.getIngrediente() instanceof Topping) {
            this.composicao.add(ingredientePizzaNovo);
        }
    }

    /**
     * Método para trocar a quantidade de um dado IngredientePizza
     *
     * @param ingrediente    Ingrediente a alterar a quantidade
     * @param quantidadeNova Quantidade nova
     */
    public void mudarQuantidadeIngredientePizza(Ingrediente ingrediente, double quantidadeNova) {

        // Iterar todos os IngredientesPizza
        for (IngredientePizza ingredientePizzaAtual : this.composicao) {

            // Se o Ingrediente do IngredientePizza for igual ao passado por parâmetro
            if (ingredientePizzaAtual.getIngrediente() == ingrediente) {
                // Mudamos a quantidade do IngredientePizza atual
                ingredientePizzaAtual.setQuantidade(quantidadeNova);
            }
        }
    }

    public void removerIngrediente(String codigoIngredienteRemover) {

        // Iterar todos os IngredientesPizza
        for (IngredientePizza ingredientePizzaAtual : this.composicao) {

            if (ingredientePizzaAtual.getIngrediente().getCodigo().equals(codigoIngredienteRemover)) {

                if (!(ingredientePizzaAtual.getIngrediente() instanceof Base)) {
                    this.composicao.remove(ingredientePizzaAtual);
                    return;
                }
            }

        }

    }

    public double calcularKCal() {
        double kcalTotais = 0;

        // Iterar todos os IngredientesPizza
        for (IngredientePizza ingredientePizzaAtual : this.composicao) {

            double quantidadeIngredienteAtual = ingredientePizzaAtual.getQuantidade();
            double kcalPorQuantidadeIngredienteAtual = ingredientePizzaAtual.getIngrediente().getKcalUnidadeMedida();

            double kcalIngredienteAtual = quantidadeIngredienteAtual * kcalPorQuantidadeIngredienteAtual;

            kcalTotais += kcalIngredienteAtual;
        }

        return kcalTotais;
    }

    public String tipoPizza() {
        int contadorCarne = 0, contadorMar = 0, contadorQueijo = 0, contadorVegetal = 0;
        int quantidadeToppings = this.composicao.size() - 1;

        for (IngredientePizza ingredientePizzaAtual : this.composicao) {
            if (ingredientePizzaAtual.getIngrediente() instanceof Queijo) {
                contadorQueijo++;
            }

            if (ingredientePizzaAtual.getIngrediente() instanceof Carne) {
                contadorCarne++;
            }

            if (ingredientePizzaAtual.getIngrediente() instanceof FrutoMar) {
                contadorMar++;
            }

            if (ingredientePizzaAtual.getIngrediente() instanceof Vegetal) {
                contadorVegetal++;
            }
        }


        if (contadorCarne == quantidadeToppings) {
            return "Carne";
        } else if (contadorVegetal == quantidadeToppings) {
            return "Vegetariana";
        } else if (contadorMar == quantidadeToppings) {
            return "Mar";
        } else if (contadorCarne >= 1 && contadorVegetal >= 1 && contadorMar >= 1 && contadorQueijo >= 1) {
            return "Completa";
        } else {
            return "Mista";
        }


    }


    public void exibirDetalhes() {
        int contador = 1;

        System.out.println("****** " + this.nome + " ******");
        System.out.println("Código: " + this.codigo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço: " + this.preco + "€");
        System.out.println("Tamanho: " + this.tamanho);

        for (IngredientePizza ingredientePizzaAtual : this.composicao) {
            System.out.print("Ingrediente " + contador++ + ": ");
            ingredientePizzaAtual.exibirDetalhes();
        }
        System.out.println();
    }

}
