package AirplaneStore;

import AirplaneStore.Enums.Arma;
import AirplaneStore.Enums.CategoriaJato;
import AirplaneStore.Enums.Instalacao;

public class Main {
    public static void main(String[] args) {

        JatoPrivado gulfstream = new JatoPrivado(111, "Gulfstream W115", 2015, 3000, 25, 7, 2.5, 2, 3550, 740, 15000, 12, 1000, CategoriaJato.LIGHT_JET);
        gulfstream.addInstalacao(Instalacao.WC);
        gulfstream.addInstalacao(Instalacao.WIFI);
        gulfstream.addInstalacao(Instalacao.TOMADAS);

        AviaoCombate f16 = new AviaoCombate(9030, "Jetfighter F16", 2005, 900, 7.5, 2, 1.2, 1, 900, 1050, 90000, "USA", false);
        f16.addArma(Arma.METRALHADORAS);
        f16.addArma(Arma.FOGUETES);

        AviaoCombate f22 = new AviaoCombate(9850, "Jetfighter F22", 2018, 990, 7.8, 2.4, 1.3, 2, 1300, 1600, 100000, "USA", true);
        f22.addArma(Arma.FOGUETES);
        f22.addArma(Arma.METRALHADORAS);
        f22.addArma(Arma.MISSEIS);
        f22.addArma(Arma.BOMBAS);

        Catalogo lojaAvioesXPTO = new Catalogo();
        lojaAvioesXPTO.adquirirAviao(gulfstream);
        lojaAvioesXPTO.adquirirAviao(f16);
        lojaAvioesXPTO.adquirirAviao(f22);

        System.out.println("Valor Total do Catalogo: "+lojaAvioesXPTO.calcularTotalCatalogo()+"€");

        lojaAvioesXPTO.imprimirCatalogo();
    }
}
