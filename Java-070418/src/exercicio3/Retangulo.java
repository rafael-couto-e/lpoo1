package exercicio3;
//subclasse de forma, tem todos os atributos e todos os métodos
//precisa ter um construtor iniciando color e filled, da mesma
//maneira que a superclasse tem
public class Retangulo extends Forma {
    private double b;
    private double h;

    public Retangulo(String color, boolean filled, double b, double h) {
        super(color, filled);
        this.b = b;
        this.h = h;
    }

    //métodos abstratos obrigatoriamente implementados com override
    @Override
    public double calcularPerimetro() {
        return b*2 + h*2;
    }

    @Override
    public double calcularArea() {
        return b*h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
