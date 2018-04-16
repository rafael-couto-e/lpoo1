package exercicio1;
//classe funcionario extende de pessoa
public class Funcionario extends Pessoa{
    protected float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    //3% do salario, como descrito na notação
    //f no final do numero converte pra float
    //funciona com inteiros tb
    public float calculaImposto(){
        return salario*0.03f;
    }
    
    @Override
    public void imprimeDados() {
        System.out.println("Nome: "+nome+"\nData de nascimento: "+nascimento.exibe()+"\nSalário: R$"+salario);
    }    
}
