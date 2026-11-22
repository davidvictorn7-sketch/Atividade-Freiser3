public class CarroParticular implements MeioTransporte, Rastreavel {
    private String placa;

    public CarroParticular(String placa) {
        this.placa = placa;
    }

    @Override
    public String getNome() {
        return "Carro particular (" + placa + ")";
    }

    @Override
    public double calcularCusto(double distanciaKm) {
        double custo = distanciaKm * 1.20;
        return Math.max(custo, TARIFA_MINIMA);
    }

    @Override
    public String obterLocalizacao() {
        return "Av. Principal, próximo ao centro";
    }
}
