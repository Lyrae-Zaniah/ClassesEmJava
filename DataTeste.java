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

        System.out.println(d1.nome + " nasceu em: " + d1.dia + "/" + d1.mes + "/" + d1.ano);
        System.out.println(d2.nome + " nasceu em: " + d2.dia + "/" + d2.mes + "/" + d2.ano);
    }
}
