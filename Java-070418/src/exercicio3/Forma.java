package exercicio3;
//Superclasse de todas as formas, tendo a cor e o atributo filled, que diz se
//ela é preenchida ou não. Obrigatoriamente informados quando construir
public abstract class Forma {
    //modificador protected, atributo pode ser visto na própria classe
    //e em todas as subclasses
    protected String color;
    protected boolean filled;

    public Forma(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //métodos abstratos: as subclasses devem implementar, obrigatoriamente.
    //cada forma vai ter um cálculo de área e perímetro diferentes.
    public abstract double calcularPerimetro();
    public abstract double calcularArea();
}
