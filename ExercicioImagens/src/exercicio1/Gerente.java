package exercicio1;
//classe gerente extende de funcionario. logo, também é do tipo pessoa
public class Gerente extends Funcionario{
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    //implementação própria do imprimedados
    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Área: "+area);
    }

    //implementaçao propria do calculaimposto
    //5% do salario, como descrito na notação
    @Override
    public float calculaImposto() {
        return salario*0.05f;
    }
}
