package Pizzaria;

import Pizzaria.Enums.TamanhoPizza;

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
        this.composicao= new ArrayList<>();
    }

    /**
     * Método para adicionar IngredientePizza à Pizza (num máximo de 5)
     * @param ingredientePizzaNovo IngredientePizza a adicionar
     */
    public void addIngredientePizza(IngredientePizza ingredientePizzaNovo) {
        if(this.composicao.size()<5){
            this.composicao.add(ingredientePizzaNovo);
        }
    }

    /**
     * Método para trocar a quantidade de um dado IngredientePizza
     * @param ingrediente Ingrediente a alterar a quantidade
     * @param quantidadeNova Quantidade nova
     */
    public void mudarQuantidadeIngredientePizza(Ingrediente ingrediente, double quantidadeNova){

        // Iterar todos os IngredientesPizza
        for(IngredientePizza ingredientePizzaAtual : this.composicao){

            // Se o Ingrediente do IngredientePizza for igual ao passado por parâmetro
            if(ingredientePizzaAtual.getIngrediente()==ingrediente){
                // Mudamos a quantidade do IngredientePizza atual
                ingredientePizzaAtual.setQuantidade(quantidadeNova);
            }
        }
    }

    public void removerIngrediente(String codigoIngredienteRemover){

        // Iterar todos os IngredientesPizza
        for(IngredientePizza ingredientePizzaAtual : this.composicao){

            if(ingredientePizzaAtual.getIngrediente().getCodigo().equals(codigoIngredienteRemover)){
                this.composicao.remove(ingredientePizzaAtual);
                return;
            }

        }

    }

    public double calcularKCal(){
        double kcalTotais=0;

        // Iterar todos os IngredientesPizza
        for(IngredientePizza ingredientePizzaAtual : this.composicao){

            double quantidadeIngredienteAtual = ingredientePizzaAtual.getQuantidade();
            double kcalPorQuantidadeIngredienteAtual = ingredientePizzaAtual.getIngrediente().getKcalUnidadeMedida();

            double kcalIngredienteAtual = quantidadeIngredienteAtual*kcalPorQuantidadeIngredienteAtual;

            kcalTotais+=kcalIngredienteAtual;
        }

        return kcalTotais;
    }


}
