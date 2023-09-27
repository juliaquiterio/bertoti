package observer;

public class Vendedor implements Observer{
	private String nome;

    public Vendedor(String nome) {
        this.nome = nome;
    }

    @Override
    public void notify(Produto produto) {
        System.out.println("Vendedor " + nome + " notificado sobre estoque mínimo do produto " + produto.getNome());
    }

}
