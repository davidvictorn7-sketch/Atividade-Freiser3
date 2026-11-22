public class Email implements Notificador, Agendavel {
    private String endereco;

    public Email(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("[E-mail] para " + endereco + ": " + mensagem);
    }

    @Override
    public String getCanal() {
        return "E-mail";
    }

    @Override
    public void agendar(String horario) {
        System.out.println("[E-mail] envio agendado para " + horario);
    }
}
