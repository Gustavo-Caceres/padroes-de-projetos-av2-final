package questao1;

public class Main {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook", 10);

        AreaCompras compras = new AreaCompras(notebook);
        AreaVendas vendas = new AreaVendas(notebook);
        AreaAuditoria auditoria = new AreaAuditoria(notebook);

        alterar(notebook, 7);
        alterar(notebook, 3);
        alterar(notebook, 3);
        alterar(notebook, 0);
        alterar(notebook, 12);

        System.out.println("\n>> Removendo a área de Compras do Notebook");
        notebook.detach(compras);
        alterar(notebook, 2);

        System.out.println("\nRegistros da Auditoria: " + auditoria.getRegistros().size());
        auditoria.getRegistros().forEach(r -> System.out.println("  - " + r));
    }

    private static void alterar(Produto produto, int quantidade) {
        System.out.println("\n" + produto.getNome() + ": " + produto.getQuantidade() + " -> " + quantidade);
        produto.setQuantidade(quantidade);
    }
}
