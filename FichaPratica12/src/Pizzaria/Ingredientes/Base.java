package Pizzaria.Ingredientes;

import Pizzaria.Enums.BasePizza;
import Pizzaria.Enums.UnidadeMedida;

public class Base extends Ingrediente{
    private BasePizza tipoBase;
    private String descricao;

    public Base(String codigo, String nome, double kcalUnidadeMedida, BasePizza tipoBase, String descricao) {
        super(codigo, nome, UnidadeMedida.GRAMAS, kcalUnidadeMedida);
        this.tipoBase = tipoBase;
        this.descricao = descricao;
    }
}
