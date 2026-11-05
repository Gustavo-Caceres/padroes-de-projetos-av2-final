package questao3;

public class ChantillyDecorator extends ComplementoDecorator {
    public ChantillyDecorator(iBebida bebida) {
        super(bebida);
    }

    @Override
    public String Descricao() {
        return bebida.Descricao() + ", Chantilly";
    }

    @Override
    public double Preco() {
        return bebida.Preco() + 2.0;
    }
}
