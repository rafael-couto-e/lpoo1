package exercicio1;
public class Main {

    public static void main(String[] args) {
        Zoologico z = new Zoologico();

        //Laço de repetição para percorrer todas as posições das jaulas
        //e inserir um animal em cada
        for(int i = 0; i < z.getJaulas().length; i++){
            //Insere os animais na jaula, criando uma instancia
            //diferente de animais diferentes pra cada posição
            switch (i%3){
                case 0:
                    z.getJaulas()[i] = new Cachorro();
                    break;
                case 1:
                    z.getJaulas()[i] = new Gato();
                    break;
                case 2:
                    z.getJaulas()[i] = new Preguica();
                    break;
            }
        }

        //Laço de repetição para percorrer todas as posições das jaulas
        //e mandar gritar
        for(int i = 0; i < z.getJaulas().length; i++){
            z.getJaulas()[i].emitirSom();
        }
    }
}
