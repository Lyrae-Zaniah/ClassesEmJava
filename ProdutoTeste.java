package Classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.valor = 4570.60;
        p1.desconto = 0.50;

        var p2 = new Produto();
        p2.nome = "Lapis";
        p2.valor = 10;
        p2.desconto = 0.25;

        double precoFinal1 = p1.valor * (1 - p1.desconto);
        double precoFinal2 = p2.valor * (1 - p2.desconto);
        double mediaCarrinho = (precoFinal1 + precoFinal2);

        System.out.println(
                "Valor Notebook: R$" + p1.valor + "\n" + "Valor Lapis: R$" + p2.valor + "\n" + "Valor total no carrinho: R$" + mediaCarrinho);
    }
}
