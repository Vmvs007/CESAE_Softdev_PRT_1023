package Ex_03.Entidades;

public abstract class Pessoa {
    private String nome;
    private int anoNascimento;
    private String email;
    private String telemovel;

    public Pessoa(String nome, int anoNascimento, String email, String telemovel) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.email = email;
        this.telemovel = telemovel;
    }

    public abstract void obterFuncao();
    public abstract void imprimirHorario();

    public void exibirDetalhes(){
        System.out.println("Nome: "+this.nome+"\t| Ano Nascimento: "+this.anoNascimento+"\t| Email: "+this.anoNascimento+"\t| Telemovel: "+this.telemovel);
    }

    public String getNome() {
        return nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getTelemovel() {
        return telemovel;
    }
}
