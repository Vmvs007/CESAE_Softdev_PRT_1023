package Pizzaria.Ingredientes;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.UnidadeMedida;

public class Topping extends  Ingrediente{

    private OrigemIngrediente origem;

    public Topping(String codigo, String nome, UnidadeMedida medidaIngrediente, double kcalUnidadeMedida, OrigemIngrediente origem) {
        super(codigo, nome, medidaIngrediente, kcalUnidadeMedida);
        this.origem = origem;
    }
}
