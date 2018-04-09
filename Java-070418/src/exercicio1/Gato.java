package exercicio1;
//SUBCLASSE GATO
public class Gato extends Animal{
    //EXERCICIO B - Anotação @override sobrescreve
    //o método emitirSom da superclasse. Quando
    //chamar emitirSom de gato, vai executar
    //esse método em vez do que está em Animal
    @Override
    public void emitirSom() {
        System.out.println("MIAAAAU");
    }
}
