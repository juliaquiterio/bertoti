package observer;

public class Main {

	public static void main(String[] args) {
		Sistema sistema = Sistema.getInstance();

        Produto produto1 = new Produto("Notebooks", 10);
        Produto produto2 = new Produto("Mouses", 15);

        Vendedor representante1 = new Vendedor(" Julia");
        Vendedor representante2 = new Vendedor(" Giuliano");

        sistema.addProduto(produto1);
        sistema.addProduto(produto2);

        sistema.addObserver(representante1);
        sistema.addObserver(representante2);

        produto1.addProduto(5); 
        produto2.addProduto(10);
    }



}
