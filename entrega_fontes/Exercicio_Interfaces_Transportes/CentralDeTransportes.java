public class CentralDeTransportes {
    public void processar(MeioTransporte transporte, double distanciaKm) {
        System.out.println(transporte.resumo(distanciaKm));
    }

    public void processarTodos(MeioTransporte[] transportes, double distanciaKm) {
        double total = 0.0;
        System.out.println("--- Comparação para " + distanciaKm + " km ---");
        for (MeioTransporte transporte : transportes) {
            processar(transporte, distanciaKm);
            total += transporte.calcularCusto(distanciaKm);
        }
        double media = total / transportes.length;
        System.out.printf("Resumo: %d opções | total R$ %.2f | média R$ %.2f%n",
                transportes.length, total, media);
    }
}
