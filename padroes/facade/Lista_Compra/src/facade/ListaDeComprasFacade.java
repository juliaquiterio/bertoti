package facade;

import java.util.LinkedList;
import java.util.List;

public class ListaDeComprasFacade {
    private List<String> itens;

    //o uso do facade sera utilizado no exemplo como o LinkedList
    public ListaDeComprasFacade() {
        this.itens = new LinkedList<>();
    }

    public void addItem(String item) {
        this.itens.add(item);
        System.out.println("Item '" + item + "' adicionado à lista de compras;");
    }

    public void removerItem(String item) {
        if (this.itens.contains(item)) {
            this.itens.remove(item);
            System.out.println("Item '" + item + "' removido da lista de compras. Não é mais preciso comprar.\n");
        } else {
            System.out.println("Ooops.... O Item '" + item + "' não encontrado na lista de compras.\n");
        }
    }


    public void visualizarLista() {
        System.out.println("*** Itens na lista de compras: ***");
        for (String item : this.itens) {
            System.out.println(item);
        }
    }

    public int contarItens() {
        return this.itens.size();
    }
}