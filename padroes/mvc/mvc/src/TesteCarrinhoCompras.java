public class TesteCarrinhoCompras {

    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        CarrinhoView carrinhoView = new CarrinhoView();
        EmailNotificacao emailNotificacao = new EmailNotificacao();

        carrinho.registerObserver(carrinhoView);
        carrinho.registerObserver(emailNotificacao);
        carrinhoView.setDescontoStrategy(new DescontoNatal());
        emailNotificacao.setCarrinho(carrinho);

        Produto produto1 = new Produto();
        produto1.setNome("Produto 1");
        produto1.setPreco(50.0);

        Produto produto2 = new Produto();
        produto2.setNome("Produto 2");
        produto2.setPreco(30.0);

        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
    }
}