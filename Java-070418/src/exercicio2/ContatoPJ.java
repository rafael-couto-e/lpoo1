package exercicio2;
//subclasse de contato, com os atributos específicos de pessoa jurídica
public class ContatoPJ extends Contato {
    private long cnpj;
    private String inscricaoEstadual;
    private String razaoSocial;

    public ContatoPJ(){
        super();
    }

    public ContatoPJ(String nome, String endereco, String email, long cnpj, String inscricaoEstadual, String razaoSocial) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    //retorna o método mostrarPessoa de contato mais os dados de PJ
    @Override
    public String mostrarPessoa() {
        return super.mostrarPessoa()+
                "\nCNPJ: "+cnpj+
                "\nInscrição estadual: "+inscricaoEstadual+
                "\nRazão Social: "+razaoSocial;
    }
}
