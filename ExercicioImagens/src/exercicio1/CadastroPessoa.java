package exercicio1;

//classe cadastropessoa
public class CadastroPessoa {
    private int qtdAtual;
    //relacionamento 1 pra n com Pessoa a partir de um array
    private Pessoa[] pessoas;

    public CadastroPessoa() {
        qtdAtual = 0;
        pessoas = new Pessoa[10];
    }
    
    //metodo cadastro pessoa com atributo pess do tipo Pessoa
    //insere uma pessoa na posição livre do array e
    //adiciona +1 na quantidade atual, pra saber que deve ir
    //pro próximo indice do vetor
    public void cadastraPessoa(Pessoa pess){
        pessoas[qtdAtual] = pess;
        qtdAtual++;
    }
    
    //metodo imprimeCadastro
    public void imprimeCadastro(){
        //exibe todos os cadastros
        for(int i = 0; i < qtdAtual; i++){
            pessoas[i].imprimeDados();
        }
    }
}