package composite;

public class Main {
    public static void main(String[] args) {
        ItemMenu entrada = new ItemMenu("Salada Caesar", 2);
        ItemMenu pratoPrincipal = new ItemMenu("Frango ao Curry", 1);
        ItemMenu sobremesa = new ItemMenu("Cheesecake de Morango", 3);

        CategoriaMenu menu = new CategoriaMenu("Cardápio do Restaurante");
        CategoriaMenu aperitivos = new CategoriaMenu("Aperitivos");
        CategoriaMenu sobremesas = new CategoriaMenu("Sobremesas");

        aperitivos.adicionar(entrada);
        menu.adicionar(pratoPrincipal);
        sobremesas.adicionar(sobremesa);

        menu.adicionar(aperitivos);
        menu.adicionar(sobremesas);

        menu.mostrarPedido();
    }
}