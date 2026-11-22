public class WhatsApp implements Notificador {
    private String numero;

    public WhatsApp(String numero) {
        this.numero = numero;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("[WhatsApp] para " + numero + ": " + mensagem + " (entregue)");
    }

    @Override
    public String getCanal() {
        return "WhatsApp";
    }
}
