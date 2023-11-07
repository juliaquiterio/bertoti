package facade;

public class Main {
	
public static void main(String[] args) {
        ListaDeComprasFacade listaDeCompras = new ListaDeComprasFacade();

        listaDeCompras.addItem("Leite");
        listaDeCompras.addItem("Pão");
        listaDeCompras.addItem("Maçãs");

        listaDeCompras.visualizarLista();

        listaDeCompras.removerItem("Pão");

        listaDeCompras.visualizarLista();

        int quantidadeDeItens = listaDeCompras.contarItens();
        System.out.println("Quantidade de itens na lista de compras: " + quantidadeDeItens);
    }
}
