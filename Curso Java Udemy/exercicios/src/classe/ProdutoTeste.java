package classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.89);

       /*
       Produto p1 = new Produto();
       p1.nome ="Notebook";
       p1.preco = 4356.89;
       p1.desconto = 0.25;
       */

        //System.out.println(p1.nome);
        //System.out.println(p1.preco);

        Produto.desconto = 0.50;

        System.out.println("Preço: " + p1.preco + ",Desconto: " + p1.desconto);

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do carrinho R$%.2f.", mediaCarrinho);



    }
}
