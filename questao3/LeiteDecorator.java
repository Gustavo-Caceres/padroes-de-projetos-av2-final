package questao3;

public class LeiteDecorator extends ComplementoDecorator {
    public LeiteDecorator(iBebida bebida) {
        super(bebida);
    }

    @Override
    public String Descricao() {
        return bebida.Descricao() + ", Leite";
    }

    @Override
    public double Preco() {
        return bebida.Preco() + 1.5;
    }
}
