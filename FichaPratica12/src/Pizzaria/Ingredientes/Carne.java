package Pizzaria.Ingredientes;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.TipoCarne;
import Pizzaria.Enums.UnidadeMedida;

public class Carne extends Topping {
    TipoCarne tipo;

    public Carne(String codigo, String nome, UnidadeMedida medidaIngrediente, double kcalUnidadeMedida, OrigemIngrediente origem, TipoCarne tipo) {
        super(codigo, nome, medidaIngrediente, kcalUnidadeMedida, origem);
        this.tipo = tipo;
    }
}
