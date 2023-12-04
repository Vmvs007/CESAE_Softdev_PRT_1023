package Pizzaria;

import Pizzaria.Enums.*;
import Pizzaria.Ingredientes.Base;
import Pizzaria.Ingredientes.Ingrediente;
import Pizzaria.Ingredientes.Queijo;

public class Main {
    public static void main(String[] args) {

        // Instanciar ingredientes
        Base baseFina = new Base("I-0011", "Base Fina Italiana", 1.5, BasePizza.FINA,"Mais italiana não há");

        Queijo queijoMozarella = new Queijo("I-0022", "Queijo Mozarella", UnidadeMedida.GRAMAS, 2.8, OrigemIngrediente.IMPORTADA, TipoQueijo.MOZZARELA);


        Ingrediente molhoTomate = new Ingrediente("I-0090", "Molho Tomate", UnidadeMedida.LITROS, 250);
        Ingrediente fiambre = new Ingrediente("I-0120", "Fiambre Perna Extra", UnidadeMedida.UNIDADES, 12);
        Ingrediente ananas = new Ingrediente("I-0100", "Ananás", UnidadeMedida.UNIDADES, 2);
        Ingrediente baseAlta = new Ingrediente("I-0012", "Base Alta", UnidadeMedida.GRAMAS, 2);
        Ingrediente molhoTomateOregaos = new Ingrediente("I-0091", "Molho Tomate c/ Oregãos", UnidadeMedida.LITROS, 100);
        Ingrediente queijoSerra = new Ingrediente("I-0023", "Queijo Serra Estrela", UnidadeMedida.GRAMAS, 10);

        // Criar pizza de queijo e fiambre
        Pizza pizzaQueijoFiambre = new Pizza("P-0001", "Pizza de Queijo e Fiambre", "Mais básica impossível", 9.90, TamanhoPizza.MEDIA);

        pizzaQueijoFiambre.addIngredientePizza(new IngredientePizza(baseFina, 200));
        pizzaQueijoFiambre.addIngredientePizza(new IngredientePizza(molhoTomate, 0.100));
        pizzaQueijoFiambre.addIngredientePizza(new IngredientePizza(queijoMozarella, 180));
        pizzaQueijoFiambre.addIngredientePizza(new IngredientePizza(fiambre, 12));

        pizzaQueijoFiambre.exibirDetalhes();

        // Criar pizza havai
        Pizza pizzaHavai = new Pizza("P-0002", "Pizza Havai", "Com todo o ananás que tem direito", 15.50, TamanhoPizza.GRANDE);

        pizzaHavai.addIngredientePizza(new IngredientePizza(baseFina, 235));
        pizzaHavai.addIngredientePizza(new IngredientePizza(molhoTomate, 0.180));
        pizzaHavai.addIngredientePizza(new IngredientePizza(queijoMozarella, 200));
        pizzaHavai.addIngredientePizza(new IngredientePizza(ananas, 16));

        pizzaHavai.mudarQuantidadeIngredientePizza(queijoMozarella, 120);

        pizzaHavai.exibirDetalhes();

        // Criar a pizza portugal
        Pizza pizzaPortugal = new Pizza("P-0003", "Pizza Portugal", "Cristiano Ronaldo é o maior", 20, TamanhoPizza.GRANDE);

        pizzaPortugal.addIngredientePizza(new IngredientePizza(baseAlta, 100)); //200
        pizzaPortugal.addIngredientePizza(new IngredientePizza(molhoTomateOregaos, 0.200)); // 20
        pizzaPortugal.addIngredientePizza(new IngredientePizza(queijoSerra, 150)); // 1500

        //System.out.println("Kcal Pizza Portugal: "+pizzaPortugal.calcularKCal());
        pizzaPortugal.exibirDetalhes();

    }
}
