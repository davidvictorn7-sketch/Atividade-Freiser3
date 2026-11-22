public interface MeioTransporte {
    double TARIFA_MINIMA = 5.0;

    String getNome();

    double calcularCusto(double distanciaKm);

    default String resumo(double distanciaKm) {
        return getNome() + " - " + String.format("R$ %.2f", calcularCusto(distanciaKm));
    }

    static boolean distanciaValida(double distanciaKm) {
        return distanciaKm > 0;
    }
}
