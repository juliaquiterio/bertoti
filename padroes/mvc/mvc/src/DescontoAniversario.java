class DescontoAniversario implements DescontoStrategy {

    @Override
    public double calcularDesconto(double preco) {
        return 0.15 * preco; // 15% de desconto de aniversário
    }
}
