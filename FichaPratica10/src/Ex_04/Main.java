package Ex_04;

public class Main {
    public static void main(String[] args) {

        Imovel casteloBelaAdormecida = new Imovel("Rua Monte Escuro",1,"Cidade Encantada",TipoImovel.MANSAO,Acabamento.USADA,4000,20,10,30);
        Imovel barracaShrek = new Imovel("Pantano do Shrek",2,"Far Far Away",TipoImovel.CASA,Acabamento.NOVA_ALTO_ACABAMENTO,40,1,1,5);

        System.out.println("Valor Castelo Bela Adormecida: "+casteloBelaAdormecida.getValorImovel()+ "€");
        System.out.println("Valor Barraca Shrek: "+barracaShrek.getValorImovel()+"€");

        System.out.println();

        casteloBelaAdormecida.imprimirDescricao();
        barracaShrek.imprimirDescricao();

        casteloBelaAdormecida.compararImoveis(barracaShrek);

    }
}
