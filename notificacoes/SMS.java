public class SMS implements Notificador {
    private String telefone;

    public SMS(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void enviar(String mensagem) {
        String texto = mensagem;
        if (mensagem.length() > 40) {
            texto = mensagem.substring(0, 40) + "...";
        }
        System.out.println("[SMS] para " + telefone + ": " + texto);
    }

    @Override
    public String getCanal() {
        return "SMS";
    }
}
