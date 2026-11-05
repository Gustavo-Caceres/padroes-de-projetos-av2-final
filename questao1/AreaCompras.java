package questao1;

public class AreaCompras extends Observer {
    private static final int ESTOQUE_MINIMO = 5;

    public AreaCompras(Produto produto) {
        this.produto = produto;
        this.produto.attach(this);
    }

    @Override
    public void update() {
        if (produto.getQuantidade() < ESTOQUE_MINIMO) {
            System.out.println("  [Compras]   ALERTA: " + produto.getNome() + " está com estoque baixo ("
                    + produto.getQuantidade() + " un.). Providenciar reposição.");
        }
    }
}
