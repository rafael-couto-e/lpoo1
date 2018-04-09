package exercicio2;
//classe agenda
public class Agenda {
    private Contato[] contatos;
    private final int qtd;

    //constroi uma lista de contatos, de acordo com o numero passado no parametro qtd
    public Agenda(int qtd){
        this.qtd = qtd;
        this.contatos = new Contato[qtd];
    }

    public Agenda(){
        this(10);
    }

    //adiciona um contato no primeiro espaço nulo do array
    public void adicionarContato(Contato c){
        //laço de repetição para ver todas as posições do array
        for(int i = 0; i < contatos.length; i++){
            //se o contato na posição i estiver livre, salva
            if(contatos[i] == null) {
                contatos[i] = c;
                System.out.println("\n**** Contato adicionado com sucesso! ****");
                break;//break encerra o laço for; o programa roda a partir
                //do fecha-chave } do laço. não precisa mais ver as outras
                //posições se já salvou o contato né :D
            }

            //se chegou no último contato e não passou pelo break,
            //informa que a lista está cheia
            if (i == contatos.length-1) {
                System.out.println("\n**** Lista de contatos cheia! ****");
            }
        }
    }

    //remove da lista o contato que tenha documento x
    public void removerContato(long documento){
        //laço de repetição para ver todas as posições do array
        for(int i = 0; i < contatos.length; i++){
            //se o contato na posição i não for nulo, verifica
            if(contatos[i] != null) {
                long cpfcnpj = contatos[i].getDocumento();

                //se o documento informado pelo usuario for igual o do
                //contato verificado, remove
                if (cpfcnpj == documento) {
                    contatos[i] = null;
                    System.out.println("\n**** Contato removido! ****");
                    break;//break encerra o laço for; o programa roda a partir
                    //do fecha-chave } do laço. não precisa mais ver as outras
                    //posições se já removeu o contato né :D
                }
            }

            //se chegou no último contato e não passou pelo break,
            //informa que não existe contato com aquele documento
            if (i == contatos.length-1){
                System.out.println("\n**** Contato não encontrado! ****");
            }
        }
    }

    //mostra os dados do contato com nome x
    public void pesquisarContatoPorNome(String nome){
        //laço de repetição para ver todas as posições do array
        for(int i = 0; i < contatos.length; i++){
            //se o contato na posição i não for nulo, verifica
            if(contatos[i] != null) {
                //compara o nome informado pelo usuário com o do contato salvo
                //se for igual, mostra os dados
                if (contatos[i].getNome().equals(nome)) {
                    System.out.println("\n**** Contato localizado: ****");
                    System.out.println(contatos[i].mostrarPessoa());
                    break;//break encerra o laço for; o programa roda a partir
                    //do fecha-chave } do laço. não precisa mais ver as outras
                    //posições se já achou o contato né :D
                }
            }

            //se chegou no último contato e não passou pelo break,
            //informa que não existe contato com aquele nome
            if (i == contatos.length - 1) {
                System.out.println("\n**** Nenhum contato localizado! ****");
            }
        }
    }

    //mostra os dados do contato com documento x
    public void pesquisarContatoPorDoc(long cpfcnpj){
        //laço de repetição para ver todas as posições do array
        for(int i = 0; i < contatos.length; i++){
            //se o contato na posição i não for nulo, verifica
            if(contatos[i] != null) {
                //compara o documento informado pelo usuário com o do contato salvo
                //se for igual, mostra os dados
                long doc = contatos[i].getDocumento();

                //break encerra o laço for; o programa roda a partir
                //do fecha-chave } do laço. não precisa mais ver as outras
                //posições se já achou o contato né :D
                if (doc == cpfcnpj) {
                    System.out.println("\n**** Contato localizado: ****");
                    System.out.println(contatos[i].mostrarPessoa());
                    break;
                }
            }

            //se chegou no último contato e não passou pelo break,
            //informa que não existe contato com aquele documento
            if(i == contatos.length - 1){
                System.out.println("\n**** Nenhum contato localizado! ****");
            }
        }
    }

    //exibe os dados de todos os contatos
    public void visualizarTodos(){
        System.out.println("\n**** **** **** **** ****");
        //laço de repetição para ver todas as posições do array
        for(int i = 0; i < contatos.length; i++){
            //se o contato na posição i não for nulo, mostra os dados
            if(contatos[i] != null){
                System.out.println(contatos[i].mostrarPessoa());
                System.out.println("**** **** **** **** ****");
            }
        }
    }

    //ordena a lista com bubble sort
    public void ordena(){
        int swaps;

        //do-while: realiza no mínimo uma vez o bloco
        //troca os contatos de posição quando precisar, verificando a ordem
        //conta quantas trocas faz
        //se fez ao menos uma troca, roda a lista toda de novo até não fazer nenhuma troca
        do{
            swaps = 0;
            int ultimoNaoNulo = 0;

            //laço de repetição para ver todas as posições do array
            //começa no 1 para poder sempre comparar a posição com a anterior
            //se iniciássemos no zero, iríamos comparar o primeiro item com
            //o item no indice -1: explode o programa
            for(int i = 1; i < contatos.length; i++){
                //se não for nulo, compara
                if(this.contatos[i] != null) {
                    if(this.contatos[ultimoNaoNulo] != null){
                        if (this.contatos[ultimoNaoNulo].getDocumento() > this.contatos[i].getDocumento()) {
                            swaps++;
                            Contato temp = this.contatos[ultimoNaoNulo];
                            this.contatos[ultimoNaoNulo] = this.contatos[i];
                            this.contatos[i] = temp;
                        }
                    }

                    ultimoNaoNulo = i;
                }
            }
        }while (swaps != 0);

        System.out.println("\n**** Lista ordenada! ****");
    }
}