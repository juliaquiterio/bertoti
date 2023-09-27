package observer;

public class Produto {
	
	private String nome;
	private int qtdEstoque;
    private int qtdMinEstoque;
    
	
    public String getNome() {
		return nome;
	}


    public void setNome(String nome) {
		this.nome = nome;
	}

    public int getQtdEstoque() {
		return qtdEstoque;
	}

    public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

    public int getQtdMinEstoque() {
		return qtdMinEstoque;
	}

    public void setQtdMinEstoque(int qtdMinEstoque) {
		this.qtdMinEstoque = qtdMinEstoque;
	}

    public Produto(String nome, int qtdMinEstoque) {
        this.nome = nome;
        this.qtdMinEstoque = qtdMinEstoque;
        this.qtdEstoque = 0;
    }

    public void addProduto(int qtd) {
        qtdEstoque += qtd;
        verifyEstoqueMin();
    }

    private void verifyEstoqueMin() {
        if (qtdEstoque <= qtdMinEstoque) {
            System.out.println("Estoque mínimo atingido para o produto " + nome + ". Notificando vendedores...");
            Sistema.getInstance().notifyVendedores(this);
        }
    }
}