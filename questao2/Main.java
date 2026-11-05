package questao2;

public class Main {
    public static void main(String[] args) {
        int minutos = 150;

        System.out.println("Mesmo tempo de permanência (" + minutos + " min) nos três perfis:");
        PerfilCobranca[] perfis = { new PerfilRotativo(), new PerfilMensalista(), new PerfilConveniado() };
        for (PerfilCobranca perfil : perfis) {
            Tiquete tiquete = new Tiquete("ABC1D23", minutos, perfil);
            imprimir(tiquete);
        }

        System.out.println("\nTroca de perfil no mesmo tíquete:");
        Tiquete tiquete = new Tiquete("XYZ9K87", 45, new PerfilRotativo());
        imprimir(tiquete);
        tiquete.setPerfil(new PerfilConveniado());
        imprimir(tiquete);
        tiquete.setPerfil(new PerfilMensalista());
        imprimir(tiquete);
    }

    private static void imprimir(Tiquete tiquete) {
        System.out.printf("  Placa %s | %3d min | %-10s | R$ %.2f%n",
                tiquete.getPlaca(), tiquete.getMinutosPermanencia(),
                tiquete.getPerfil().getNome(), tiquete.calcularValor());
    }
}
