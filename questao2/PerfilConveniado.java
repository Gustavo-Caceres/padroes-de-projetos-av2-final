package questao2;

public class PerfilConveniado implements PerfilCobranca {

    public static final int MINUTOS_GRATUITOS = 30;
    public static final double VALOR_POR_HORA = 10.00;
    public static final double PERCENTUAL_DESCONTO = 0.20;

    @Override
    public String getNome() {
        return "Conveniado";
    }

    @Override
    public double calcular(int minutos) {
        int minutosCobrados = Math.max(0, minutos - MINUTOS_GRATUITOS);
        int horasIniciadas = (minutosCobrados + 59) / 60;
        return horasIniciadas * VALOR_POR_HORA * (1 - PERCENTUAL_DESCONTO);
    }
}
