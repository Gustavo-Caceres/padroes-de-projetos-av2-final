package questao1;

import java.util.ArrayList;
import java.util.List;

public class AreaAuditoria extends Observer {
    private List<String> registros = new ArrayList<>();

    public AreaAuditoria(Produto produto) {
        this.produto = produto;
        this.produto.attach(this);
    }

    @Override
    public void update() {
        String registro = "Estoque de " + produto.getNome() + " alterado para " + produto.getQuantidade();
        registros.add(registro);
        System.out.println("  [Auditoria] " + registro);
    }

    public List<String> getRegistros() {
        return List.copyOf(registros);
    }
}
