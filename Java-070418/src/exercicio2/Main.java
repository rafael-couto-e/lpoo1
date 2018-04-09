package exercicio2;
//classe main, só pra teste
public class Main {
    public static void main(String[] args) {
        int qtd = 12;

        Agenda a = new Agenda(qtd);

        //insere 12 novos contatos
        for(int i = 0; i < qtd; i++){
            Contato c;

            switch (i%4){
                case 0:
                    c = new ContatoPF(
                            "Carlos", "Rua A",
                            "carlos@gmail.com", 10598834255L,
                            "01/01/1990", "Solteiro"
                    );
                    break;
                case 1:
                    c = new ContatoPJ(
                            "Empresa", "Rua B",
                            "empresa@empresa.com", 88333333000111L,
                            "123456", "Empresa SA"
                    );
                    break;
                case 2:
                    c = new ContatoPF(
                            "Zeca", "Rua C",
                            "zeca@gmail.com", 59922362211L,
                            "01/01/1980", "Casado"
                    );
                    break;
                default:
                    c = new ContatoPJ(
                            "Firma", "Rua D",
                            "firma@firma.com", 87555231111111L,
                            "7891011", "Firma SA"
                    );
                    break;
            }

            a.adicionarContato(c);
        }

        //lista todos os contatos
        a.visualizarTodos();
        //ordena contatos de acordo com documento
        a.ordena();
        //lista todos os contatos
        a.visualizarTodos();
        //remove o contato com CPF/CNPJ x
        a.removerContato(10598834255L);
        //lista todos os contatos
        a.visualizarTodos();
        //remove o contato com CPF/CNPJ x
        a.removerContato(88333333000111L);
        //lista todos os contatos
        a.visualizarTodos();
        //remove o contato com CPF/CNPJ x (não tem kkkj)
        a.removerContato(99999999999L);
        //mostra informações do contato com nome x
        a.pesquisarContatoPorNome("Empresa");
        //mostra informações do contato com documento x
        a.pesquisarContatoPorDoc(59922362211L);
        //mostra informações do contato com nome x (não tem kkkj)
        a.pesquisarContatoPorNome("José");
        //mostra informações do contato com documento x (não tem kkkj)
        a.pesquisarContatoPorDoc(99999999999L);
    }
}
