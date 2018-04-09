package exercicio3;
//subclasse de forma, tem todos os atributos e todos os métodos
//precisa ter um construtor iniciando color e filled, da mesma
//maneira que a superclasse tem
public class Circulo extends Forma {
    private double raio;

    public Circulo(String color, boolean filled, double raio) {
        super(color, filled);
        this.raio = raio;
    }

    //métodos abstratos obrigatoriamente implementados com override
    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*(raio*raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
