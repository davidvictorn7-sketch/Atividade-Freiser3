public class Motocicleta implements MeioTransporte {
    private String modelo;

    public Motocicleta(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getNome() {
        return "Motocicleta " + modelo;
    }

    @Override
    public double calcularCusto(double distanciaKm) {
        double custo = distanciaKm * 0.75;
        return Math.max(custo, TARIFA_MINIMA - 1.0);
    }
}
