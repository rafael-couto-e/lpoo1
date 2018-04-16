package exercicio1;

//classe data com dia, mes e ano
public class Data {
    private int dia;
    private int mes;
    private int ano;

    //não está na notação, criei pra ficar mais facil de instanciar
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    //não está na notação, criei pra exibir a data mais fácil
    public String exibe(){
        return dia+"/"+mes+"/"+ano;
    }
}