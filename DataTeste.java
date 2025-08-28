package Classe;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data();
        d1.nome = "Guilherme Polaski";
        d1.dia = 20;
        d1.mes = 8;
        d1.ano = 2005;

        var d2 = new Data();
        d2.nome = "Joel Polaski";
        d2.dia = 30;
        d2.mes = 10;
        d2.ano = 1975;

        Data d3 = new Data();

        Data d4 = new Data(25, 5, 1999);

        System.out.println(d1.obterData());
        System.out.println(d2.obterData());
        System.out.println(d3.obterData());
        System.out.println(d4.obterData());
    }
}
