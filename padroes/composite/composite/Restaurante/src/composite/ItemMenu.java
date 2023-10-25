package composite;

public class ItemMenu implements Menu {
    private String nome;
    private int quantidade;

    public ItemMenu(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void mostrarPedido() {
        System.out.printf("%s - Quantidade: %d%n", nome, quantidade);
    }
}
