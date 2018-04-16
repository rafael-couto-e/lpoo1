package exercicio2;
//A CLASSE NÃO É ABSTRATA!
public class Funcionario {
    private float numeroDeHoras;
    private float valorHora;
    private String nome;

    public float getNumeroDeHoras() {
        return numeroDeHoras;
    }

    public void setNumeroDeHoras(float numeroDeHoras) {
        this.numeroDeHoras = numeroDeHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //implementação como no diagrama
    //notação com "+" -> public
    public float calcularSalario(){
        return this.numeroDeHoras*this.valorHora;
    }
    
    //prof não declarou a implementação desse método no diagrama
    public float calcularSalario(int mes){
        System.out.println("Salario do mes "+mes+": ");
        return this.numeroDeHoras*this.valorHora;
    }
}