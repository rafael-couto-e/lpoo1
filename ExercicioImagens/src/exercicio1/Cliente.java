package exercicio1;

//Classe cliente extende de pessoa
public class Cliente extends Pessoa{
    //método codigo
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    //implementação propria do metodo abstrato imprimeDados
    @Override
    public void imprimeDados() {
        System.out.println("Nome: "+nome+"\nData de nascimento: "+nascimento.exibe()+"\nCódigo: "+codigo);
    }
}
