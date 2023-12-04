package Ex_01;

import java.util.ArrayList;

public class GestorTerrenos {
    private String proprietario;
    private ArrayList<FiguraGeometrica> terrenos;

    public GestorTerrenos(String proprietario) {
        this.proprietario = proprietario;
        this.terrenos = new ArrayList<>();
    }

    public String getProprietario() {
        return proprietario;
    }

    public void addTerreno(FiguraGeometrica terrenoNovo) {
        this.terrenos.add(terrenoNovo);
    }

    public double calcularAreaTerrenos() {
        double areaTotal = 0;

        for (FiguraGeometrica figuraGeometricaAtual : this.terrenos) {
            areaTotal += figuraGeometricaAtual.area();
        }

        return areaTotal;
    }

    public double calcularPerimetroTerrenos() {
        double perimetroTotal = 0;

        for (FiguraGeometrica figuraGeometricaAtual : this.terrenos) {
            perimetroTotal += figuraGeometricaAtual.perimetro();
        }

        return perimetroTotal;
    }
}
