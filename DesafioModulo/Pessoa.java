package Classe.DesafioModulo;

public class Pessoa {

    String nome;
    double peso;

    Pessoa(String nNomePessoa, double nPesoPessoa) {
        nome = nNomePessoa;
        peso = nPesoPessoa;
    }
    void comer(Comida comida) {
        this.peso += comida.pesoComida;
    }
}
