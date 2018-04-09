package exercicio1;
//SUPER CLASSE ANIMAL
public abstract /*//EXERCICIO 1 - d.
                classes abstratas (abstract)
                não podem ser instanciadas :)*/ class Animal {
    public Animal(){

    }

    //EXERCICIO A - método geral (na superclasse) para emitir som
    //Como cachorro, gato e preguiça são animais, todos conseguem
    //emitir som
    public void emitirSom(){
        System.out.println("SOM GENÉRICO PARA TODOS OS ANIMAIS");
    }
}