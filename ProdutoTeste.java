package Classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto(
                "Notebook",
                5000);

        var p2 = new Produto();
        p2.nome = "Lapis";
        p2.valor = 10;


        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double mediaCarrinho = (precoFinal1 + precoFinal2);

        System.out.println(
                "Valor Notebook: R$" + p1.valor + "\n" + "Valor Lapis: R$" + p2.valor + "\n" + "Valor total no carrinho: R$" + mediaCarrinho);

        Produto.desconto = 0.75;

        System.out.println(p1.precoComDesconto());
    }
}
