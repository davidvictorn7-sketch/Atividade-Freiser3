public class Main {
    public static void main(String[] args) {
        double distancia = 25.0;

        MeioTransporte escolhido = new CarroParticular("ABC-1234");
        System.out.println("Variável da interface: " + escolhido.resumo(distancia));
        System.out.println("Distância válida? " + MeioTransporte.distanciaValida(distancia));

        MeioTransporte[] opcoes = {
            new CarroParticular("ABC-1234"),
            new Motocicleta("Street 160"),
            new OnibusUrbano("305"),
            new BicicletaCompartilhada("B-077")
        };

        CentralDeTransportes central = new CentralDeTransportes();
        central.processarTodos(opcoes, distancia);

        Rastreavel rastreavel = new CarroParticular("XYZ-9876");
        System.out.println("Localização rastreável: " + rastreavel.obterLocalizacao());

        // Extensão: BicicletaCompartilhada entrou no vetor sem alterar a interface
        // nem a classe CentralDeTransportes (o serviço continua genérico).

        // Erro 1 provocado em teste: MeioTransporte transporte = new MeioTransporte();
        // Primeira linha esperada: "MeioTransporte is abstract; cannot be instantiated"
        // Explicação: uma interface define um contrato e não pode ser instanciada diretamente.

        // Erro 2 provocado em teste: uma classe que omita calcularCusto ou getNome.
        // Primeira linha esperada: "... is not abstract and does not override abstract method ..."
        // Explicação: toda classe concreta que usa implements precisa implementar todos os métodos.
    }
}
