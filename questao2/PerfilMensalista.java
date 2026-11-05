package questao2;

public class PerfilMensalista implements PerfilCobranca {

    public static final double VALOR_FIXO = 15.00;

    @Override
    public String getNome() {
        return "Mensalista";
    }

    @Override
    public double calcular(int minutos) {
        return VALOR_FIXO;
    }
}
