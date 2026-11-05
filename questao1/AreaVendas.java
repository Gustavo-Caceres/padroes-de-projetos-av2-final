package questao1;

public class AreaVendas extends Observer {
    private int ultimaQuantidade;

    public AreaVendas(Produto produto) {
        this.produto = produto;
        this.ultimaQuantidade = produto.getQuantidade();
        this.produto.attach(this);
    }

    @Override
    public void update() {
        int quantidadeAtual = produto.getQuantidade();
        if (ultimaQuantidade == 0 && quantidadeAtual > 0) {
            System.out.println("  [Vendas]    ALERTA: " + produto.getNome() + " voltou a ter estoque ("
                    + quantidadeAtual + " un.). Liberar vendas.");
        }
        ultimaQuantidade = quantidadeAtual;
    }
}
