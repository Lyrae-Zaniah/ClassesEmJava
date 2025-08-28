package Classe;

public class Data {

    int dia;
    int mes;
    int ano;
    String nome;

    Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data(int diaInicial, int mesInicial, int anoInicial) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    String obterData() {
        return String.format(nome + " nasceu em: " + "%d/%d/%d", dia, mes, ano);
    }
}
