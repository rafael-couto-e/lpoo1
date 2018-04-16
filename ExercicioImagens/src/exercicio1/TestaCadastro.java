package exercicio1;

//classe TestaCadastro com método main
public class TestaCadastro {
    public static void main(String[] args) {
        CadastroPessoa cadastro = new CadastroPessoa();
        
        Cliente c = new Cliente();
        c.setNome("Cliente");
        c.setNascimento(new Data(1, 1, 1990));
        c.setCodigo(1);
        
        Funcionario f = new Funcionario();
        f.setNome("Funcionario");
        f.setNascimento(new Data(10, 10, 1980));
        f.setSalario(2500f);
        
        Gerente g = new Gerente();
        g.setNome("Gerente");
        g.setNascimento(new Data(18, 12, 1973));
        g.setSalario(4000f);
        g.setArea("RH");
        
        cadastro.cadastraPessoa(c);
        cadastro.cadastraPessoa(f);
        cadastro.cadastraPessoa(g);
        
        cadastro.imprimeCadastro();
    }
}
