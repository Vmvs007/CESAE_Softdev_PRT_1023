package Pizzaria.Ingredientes;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.TipoFrutoMar;
import Pizzaria.Enums.UnidadeMedida;

public class FrutoMar extends Topping{
    TipoFrutoMar tipo;

    public FrutoMar(String codigo, String nome, UnidadeMedida medidaIngrediente, double kcalUnidadeMedida, OrigemIngrediente origem, TipoFrutoMar tipo) {
        super(codigo, nome, medidaIngrediente, kcalUnidadeMedida, origem);
        this.tipo = tipo;
    }
}
