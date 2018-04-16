package exercicio2;

public class Gerente extends Funcionario{
    //variável inicializada por padrão
    //notação com "-" -> private
    private float desempenho = 0.02f;

    @Override
    public float calcularSalario() {
        return super.calcularSalario() * (1+this.desempenho);
    }

    @Override
    public float calcularSalario(int mes) {
        return super.calcularSalario(mes) * (1+this.desempenho);
    }
}
