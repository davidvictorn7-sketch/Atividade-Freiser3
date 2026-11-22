public class Telegram implements Notificador {
    private String usuario;

    public Telegram(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("[Telegram] para " + usuario + ": " + mensagem);
    }

    @Override
    public String getCanal() {
        return "Telegram";
    }
}
