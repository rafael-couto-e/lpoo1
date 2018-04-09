package exercicio1;
//EXERCICIO 1 - C
public class Zoologico {
    private Animal[] jaulas;

    //Instanciando objeto zoologico, cria um array com 10 jaulas
    public Zoologico(){
        jaulas = new Animal[10];
    }

    public Animal[] getJaulas() {
        return jaulas;
    }
}
