package questao3;

public class CaldaDecorator extends ComplementoDecorator {
    public CaldaDecorator(iBebida bebida) {
        super(bebida);
    }

    @Override
    public String Descricao() {
        return bebida.Descricao() + ", Calda de caramelo";
    }

    @Override
    public double Preco() {
        return bebida.Preco() + 1.75;
    }
}
