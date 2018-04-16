package exercicio2;

public class Vendedor extends Funcionario{
    //variável inicializada por padrão
    private float comissao = 0.03f;

    @Override
    public float calcularSalario() {
        return super.calcularSalario() * (1+this.comissao);
    }

    @Override
    public float calcularSalario(int mes) {
        return super.calcularSalario(mes) * (1+this.comissao);
    }
}
