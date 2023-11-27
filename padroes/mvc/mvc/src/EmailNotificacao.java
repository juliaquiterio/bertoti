import java.util.List;

public class EmailNotificacao implements Observer {
    private CarrinhoCompras carrinho;

    @Override
    public void update(List items) {
        System.out.println("Enviando e-mail de notificação para o cliente.");
    }

    public void setCarrinho(CarrinhoCompras carrinho) {
        this.carrinho = carrinho;
    }
}