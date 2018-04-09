package exercicio3;
//subclasse de Retangulo, tem todos os atributos e todos os métodos
//que retângulo E forma tem, pois retângulo é subclasse de forma.
//Um quadrado é um retângulo com base e altura iguais, logo, extende Retangulo
//precisa ter um construtor iniciando color, filled, base e altura, da mesma
//maneira que a superclasse Retangulo tem
public class Quadrado extends Retangulo {
    public Quadrado(String color, boolean filled, double lado) {
        super(color, filled, lado, lado);
    }
}