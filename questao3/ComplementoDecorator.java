package questao3;

public abstract class ComplementoDecorator implements iBebida {
    protected iBebida bebida;

    public ComplementoDecorator(iBebida bebida) {
        this.bebida = bebida;
    }
}
