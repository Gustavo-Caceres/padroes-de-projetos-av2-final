package questao2;

public class PerfilRotativo implements PerfilCobranca {

    public static final double VALOR_POR_HORA = 10.00;

    @Override
    public String getNome() {
        return "Rotativo";
    }

    @Override
    public double calcular(int minutos) {
        int horasIniciadas = (minutos + 59) / 60;
        return horasIniciadas * VALOR_POR_HORA;
    }
}
