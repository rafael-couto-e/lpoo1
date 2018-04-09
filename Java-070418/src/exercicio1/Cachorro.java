package exercicio1;
//SUBCLASSE CACHORRO
public class Cachorro extends Animal{
    //EXERCICIO B - Anotação @override sobrescreve
    //o método emitirSom da superclasse. Quando
    //chamar emitirSom de cachorro, vai executar
    //esse método em vez do que está em Animal
    @Override
    public void emitirSom() {
        System.out.println("AU AU");
    }
}
