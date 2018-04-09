package exercicio2;
//Classe contato
//abstrata, não pode instanciar um contato genérico
//propriedades em comum ficam aqui
public abstract class Contato {
    protected String nome;
    protected String endereco;
    protected String email;

    public Contato() {
    }

    public Contato(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getDocumento(){
        if(this instanceof ContatoPF){
            ContatoPF c = (ContatoPF) this;
            return c.getCpf();
        }else{
            ContatoPJ c = (ContatoPJ) this;
            return c.getCnpj();
        }
    }

    //retorna os dados que todos contatos tem
    public String mostrarPessoa(){
        return "Nome: "+nome+
                "\nEndereço: "+endereco+
                "\nEmail: "+email;
    }
}
