package Controllers;

import Domain.Venda;
import Repository.VendasRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ClientController {
    private ArrayList<Venda> todasVendas;

    public ClientController() throws FileNotFoundException {
        VendasRepository repository = new VendasRepository("Ficheiros/minimercado.csv");
        this.todasVendas = repository.getVendaArray();
    }

    public Venda produtoMaisCaro() {
        double precoMaisCaro = 0;
        Venda vendaProdutoMaisCaro = null;

        for (Venda vendaAtual : this.todasVendas) {
            if (vendaAtual.getPrecoUnitario() > precoMaisCaro) {
                precoMaisCaro = vendaAtual.getPrecoUnitario();
                vendaProdutoMaisCaro = vendaAtual;
            }
        }

        return vendaProdutoMaisCaro;
    }
}
