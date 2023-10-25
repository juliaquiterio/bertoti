package composite;

import java.util.ArrayList;
import java.util.List;

public class CategoriaMenu implements Menu {
    private String nome;
    private List<Menu> componentesMenu = new ArrayList<>();

    public CategoriaMenu(String nome) {
        this.nome = nome;
    }

    public void adicionar(Menu Menu) {
        componentesMenu.add(Menu);
    }

    public void mostrarPedido() {
        System.out.println("--- " + nome + " ---");
        for (Menu componente : componentesMenu) {
            componente.mostrarPedido();
        }
    }
}