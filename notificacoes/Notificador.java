public interface Notificador {
    void enviar(String mensagem);
    String getCanal();

    default void enviarUrgente(String mensagem) {
        enviar("URGENTE: " + mensagem);
    }
}
