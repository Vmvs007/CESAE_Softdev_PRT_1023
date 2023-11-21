package Ex_05;

public class Agenda {
    private Pessoa[] agenda;

    public Agenda() {
        this.agenda = new Pessoa[100];
    }

   public void addPessoa(Pessoa pessoaNova){
        for(int i =0; i<this.agenda.length;i++){
            if(this.agenda[i]==null){
                this.agenda[i]= pessoaNova;
                return;
            }
        }
   }

   public void listarAgenda(){
       System.out.println("********************************************* Agenda *********************************************");
        for(int i =0;i<this.agenda.length;i++){
            if(this.agenda[i]!=null){
                this.agenda[i].exibirDetalhes();
            }
        }
       System.out.println("**************************************************************************************************");
   }
}
