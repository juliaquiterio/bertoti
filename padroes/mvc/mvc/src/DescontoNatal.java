class DescontoNatal implements DescontoStrategy {

    @Override
    public double calcularDesconto(double preco) {
        return 0.1 * preco; // 10% de desconto de Natal
    }
}