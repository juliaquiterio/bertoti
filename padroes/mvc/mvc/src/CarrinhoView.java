import java.util.ArrayList;
import java.util.List;

public class CarrinhoView implements Observer {
    private DescontoStrategy descontoStrategy;
    private List<Produto> listaProdutos = new ArrayList<>();

    public void calcularDesconto(){
        double total = 0;
        for (Produto produto : listaProdutos) {
            total += produto.getPreco();
        }

        double desconto = descontoStrategy.calcularDesconto(total);
        System.out.println("Desconto calculado: " + desconto);
        // Aplica o desconto no total e exibe na view
    }

    @Override
    public void update(List items) {
        listaProdutos = items;
        calcularDesconto();
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }
}