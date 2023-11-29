package Pizzaria.Ingredientes;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.TipoVegetal;
import Pizzaria.Enums.UnidadeMedida;

public class Vegetal extends Topping{
    TipoVegetal tipo;

    public Vegetal(String codigo, String nome, UnidadeMedida medidaIngrediente, double kcalUnidadeMedida, OrigemIngrediente origem, TipoVegetal tipo) {
        super(codigo, nome, medidaIngrediente, kcalUnidadeMedida, origem);
        this.tipo = tipo;
    }
}
