package exercicio2;
//subclasse de contato, com os atributos específicos de pessoa fisica
public class ContatoPF extends Contato {
    private long cpf;
    private String dataNasc;
    private String estadoCivil;

    public ContatoPF() {
        super();
    }

    public ContatoPF(String nome, String endereco, String email, long cpf, String dataNasc, String estadoCivil) {
        super(nome, endereco, email);
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.estadoCivil = estadoCivil;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    //retorna o método mostrarPessoa de contato mais os dados de PF
    @Override
    public String mostrarPessoa() {
        return super.mostrarPessoa()+
                "\nCPF: "+cpf+
                "\nData de Nascimento: "+dataNasc+
                "\nEstado civil: "+estadoCivil;
    }
}
