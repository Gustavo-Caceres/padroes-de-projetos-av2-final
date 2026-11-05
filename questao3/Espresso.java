package questao3;

public class Espresso implements iBebida {
    @Override
    public String Descricao() {
        return "Espresso";
    }

    @Override
    public double Preco() {
        return 6.0;
    }
}
