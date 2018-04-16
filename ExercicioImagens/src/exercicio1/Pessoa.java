package exercicio1;

//notação <<abstract>> no UML - classe abstrata Pessoa
public abstract class Pessoa {
    //atributos nome e nascimento
    protected String nome;
    //atributo nascimento é do tipo Data. Definição da classe no diagrama
    protected Data nascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }
    
    //notação <<abstract>> no UML - método abstrato
    public abstract void imprimeDados();
}
