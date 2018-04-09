package exercicio3;
//main apenas pra testes
public class Main {
    public static void main(String[] args) {
        Forma circulo = new Circulo("Preto", true, 3);
        Forma quadrado = new Quadrado("Roxo", false, 10);
        Forma retangulo = new Retangulo("Verde", true, 5, 10);

        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());

        System.out.println(quadrado.calcularArea());
        System.out.println(quadrado.calcularPerimetro());

        System.out.println(retangulo.calcularArea());
        System.out.println(retangulo.calcularPerimetro());
    }
}
