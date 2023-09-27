package observer;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private static Sistema instance = new Sistema();
    private List<Produto> produtos = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    private Sistema() {
    	
    }

    public static Sistema getInstance() {
        return instance;
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }
    
    public void deleteProduto(Observer observer) {
    	observers.remove(observer);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void deleteObservers(Observer observer) {
    	observers.remove(observer);
    }

    public void notifyVendedores(Produto produto) {
        for (Observer observer : observers) {
            observer.notify(produto);
        }
    }
}