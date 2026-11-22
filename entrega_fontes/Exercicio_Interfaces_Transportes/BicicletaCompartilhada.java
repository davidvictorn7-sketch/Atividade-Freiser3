public class BicicletaCompartilhada implements MeioTransporte {
    private String codigo;

    public BicicletaCompartilhada(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getNome() {
        return "Bicicleta compartilhada " + codigo;
    }

    @Override
    public double calcularCusto(double distanciaKm) {
        double custo = 2.0 + distanciaKm * 0.35;
        if (distanciaKm > 10.0) {
            custo += 3.0;
        }
        return custo;
    }
}
