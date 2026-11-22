public class OnibusUrbano implements MeioTransporte, Rastreavel {
    private String linha;

    public OnibusUrbano(String linha) {
        this.linha = linha;
    }

    @Override
    public String getNome() {
        return "Ônibus linha " + linha;
    }

    @Override
    public double calcularCusto(double distanciaKm) {
        double tarifa = 5.50;
        if (distanciaKm > 20.0) {
            tarifa += 1.50;
        }
        return tarifa;
    }

    @Override
    public String obterLocalizacao() {
        return "Terminal Norte";
    }
}
