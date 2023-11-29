package Pizzaria.Ingredientes;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.TipoQueijo;
import Pizzaria.Enums.UnidadeMedida;

public class Queijo extends Topping{
    private TipoQueijo tipo;

    public Queijo(String codigo, String nome, UnidadeMedida medidaIngrediente, double kcalUnidadeMedida, OrigemIngrediente origem, TipoQueijo tipo) {
        super(codigo, nome, medidaIngrediente, kcalUnidadeMedida, origem);
        this.tipo = tipo;
    }
}
