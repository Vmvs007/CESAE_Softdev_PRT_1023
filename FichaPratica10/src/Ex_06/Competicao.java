package Ex_06;


public class Competicao {
    private String nome;
    private String pais;
    private Atleta[] listaParticipantes;

    public Competicao(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
        this.listaParticipantes = new Atleta[1000];
    }

    public void inscreverAtleta(Atleta atletaNovo) {
        for (int i = 0; i < this.listaParticipantes.length; i++) {
            if (this.listaParticipantes[i] == null) {
                this.listaParticipantes[i] = atletaNovo;
                return;
            }
        }
    }


    public void imprimirCompeticao() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Pais: " + this.pais);
        System.out.println("Lista de Participantes: ");
        for(int i=0; i< this.listaParticipantes.length;i++){
            if(this.listaParticipantes[i]!=null){
                // Imprimir informações do inscrito
                System.out.print("Participante "+i+": ");
                this.listaParticipantes[i].imprimirDetalhes();
                System.out.println();
            }
        }
    }

}
