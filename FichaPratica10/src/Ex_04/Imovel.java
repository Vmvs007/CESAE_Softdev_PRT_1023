package Ex_04;

public class Imovel {
    private String rua;
    private int porta;
    private String cidade;
    private TipoImovel tipo;
    private Acabamento acabamento;
    private double area;
    private int nQuartos;
    private int nWCs;
    private double areaPiscina;

    /**
     * Método Construtor de <b>Imóvel</b>
     * @param rua Rua do <b>Imóvel</b>
     * @param porta Número da Porta do <b>Imóvel</b>
     * @param cidade Cidade do <b>Imóvel</b>
     * @param tipo Tipo do <b>Imóvel</b>
     * @param acabamento Acabemento do <b>Imóvel</b>
     * @param area Área (m2) do <b>Imóvel</b>
     * @param nQuartos Número de Quartos do <b>Imóvel</b>
     * @param nWCs Número de Casas de Banho do <b>Imóvel</b>
     * @param areaPiscina Área da Piscina (m2) do <b>Imóvel</b>
     */
    public Imovel(String rua, int porta, String cidade, TipoImovel tipo, Acabamento acabamento, double area, int nQuartos, int nWCs, double areaPiscina) {
        this.rua = rua;
        this.porta = porta;
        this.cidade = cidade;
        this.tipo = tipo;
        this.acabamento = acabamento;
        this.area = area;
        this.nQuartos = nQuartos;
        this.nWCs = nWCs;
        this.areaPiscina = areaPiscina;
    }

    /**
     * Método que retorna o valor (€) do <b>Imóvel</b>
     * @return
     */
    public double getValorImovel() {

        double valorImovel = 0;

        // Calcular o preço da área
        if (this.tipo.equals(TipoImovel.APARTAMENTO)) { // Apartamento
            valorImovel += this.area * 1000;
        }

        if (this.tipo.equals(TipoImovel.CASA)) { // Casa
            valorImovel += this.area * 3000;
        }

        if (this.tipo.equals(TipoImovel.MANSAO)) { // Mansao
            valorImovel += this.area * 5000;
        }

        // Aumentar de acordo com: numero quartos
        valorImovel += this.nQuartos * 7500;

        // Aumentar de acordo com: numero WCs
        valorImovel += this.nWCs * 10500;

        // Aumentar de acordo com: area piscina
        valorImovel += this.areaPiscina * 1000;

        // Aplicar desconto ou valorização

        if (this.acabamento.equals(Acabamento.PARA_RESTAURO)) { // Imovel para restauro
            valorImovel *= 0.5;
        }

        if (this.acabamento.equals(Acabamento.USADA)) { // Imovel usado
            valorImovel *= 0.9;
        }

        if (this.acabamento.equals(Acabamento.NOVA_ALTO_ACABAMENTO)) { // Imovel alto acabamento
            valorImovel *= 1.25;
        }

        return valorImovel;

    }

    /**
     * Método que compara o valor de dois <b>Imóveis</b>
     * @param imovelComparado <b>Imóvel</b> a comparar
     * @return <b>Imóvel</b> mais caro || null em caso de empate
     */
    public Imovel compararImoveis(Imovel imovelComparado) {

        if (this.getValorImovel() > imovelComparado.getValorImovel()) {
            return this;
        } else if (this.getValorImovel() < imovelComparado.getValorImovel()) {
            return imovelComparado;
        }

        return null;

    }

    /**
     * Método que imprime todos os detalhes do <b>Imóvel</b>
     */
    public void imprimirDescricao() {
        System.out.println("Rua: " + this.rua);
        System.out.println("Nº Porta: " + this.porta);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Acabamento: " + this.acabamento);
        System.out.println("Área: " + this.area + " m2");
        System.out.println("Nº de Quartos: " + this.nQuartos);
        System.out.println("Nº de WCs: " + this.nWCs);
        System.out.println("Área Piscina: " + this.areaPiscina + " m2");
        System.out.println("Preço: " + this.getValorImovel() + " €\n");

    }

}
