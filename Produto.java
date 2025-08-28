package Classe;

public class Produto {

    String nome;
    double valor;
    static double desconto = 0.25;

    Produto(String nomeInicial, double valorInicial) {
        nome = nomeInicial;
        valor = valorInicial;
    }

    Produto() {

    }

    double precoComDesconto() {
        return valor * (1-desconto);
    }
}
