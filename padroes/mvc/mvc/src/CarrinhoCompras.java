import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras implements Subject {
    private List<Produto> produtos = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers(List encontrados) {
        for (Observer observer : observers) {
            observer.update(encontrados);
        }
    }

    public void adicionarProduto(Produto p){
        produtos.add(p);
        notifyObservers(produtos);
    }

    public void buscarProduto(Produto p){
        // Lógica da busca de produto
        List<Produto> encontrados = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.matches(p)) {
                encontrados.add(produto);
            }
        }
        notifyObservers(encontrados);
    }
}