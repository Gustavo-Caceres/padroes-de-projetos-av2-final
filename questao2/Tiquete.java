package questao2;

public class Tiquete {

    private String placa;
    private int minutosPermanencia;
    private PerfilCobranca perfil;

    public Tiquete(String placa, int minutosPermanencia, PerfilCobranca perfil) {
        if (minutosPermanencia < 0) {
            throw new IllegalArgumentException("Tempo de permanência não pode ser negativo");
        }
        this.placa = placa;
        this.minutosPermanencia = minutosPermanencia;
        this.perfil = perfil;
    }

    public void setPerfil(PerfilCobranca perfil) {
        this.perfil = perfil;
    }

    public double calcularValor() {
        return perfil.calcular(minutosPermanencia);
    }

    public String getPlaca() {
        return placa;
    }

    public int getMinutosPermanencia() {
        return minutosPermanencia;
    }

    public PerfilCobranca getPerfil() {
        return perfil;
    }
}
