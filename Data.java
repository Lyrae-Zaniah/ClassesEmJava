package Classe;

public class Data {

    int dia;
    int mes;
    int ano;
    String nome;

    Data() {
//        dia = 1;
//        mes = 1;
//        ano = 1970;
        this(1, 1, 1970);
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterData() {
        return String.format(nome + " nasceu em: " + "%d/%d/%d", dia, mes, ano);
    }
}
