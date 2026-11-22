public class Main {
    public static void main(String[] args) {
        Notificador primeiroAviso = new Email("ana@unileste.edu.br");
        primeiroAviso.enviar("Bem-vinda ao curso de POO!");

        System.out.println();

        CentralDeAvisos central = new CentralDeAvisos();
        Notificador[] canais = {
            new Email("ana@unileste.edu.br"),
            new SMS("(31) 99999-0001"),
            new WhatsApp("(31) 98888-0002"),
            new Telegram("@ana_poo")
        };

        central.avisarTodos(canais,
            "A prova de POO foi remarcada para sexta-feira às 19h.");

        System.out.println();

        Notificador whatsappUrgente = new WhatsApp("(31) 98888-0002");
        whatsappUrgente.enviarUrgente("A sala mudou para o bloco B.");

        Email emailAgendado = new Email("ana@unileste.edu.br");
        emailAgendado.agendar("18h00");

        // Passo 7 - Erro A (tentativa de instanciar a interface):
        // Main.java: erro: Notificador is abstract; cannot be instantiated
        // Explicação: uma interface define um contrato e não pode ser instanciada diretamente com new.

        // Passo 7 - Erro B (WhatsApp sem implementar getCanal):
        // WhatsApp.java: error: WhatsApp is not abstract and does not override abstract method getCanal() in Notificador
        // Explicação: toda classe concreta que implementa Notificador deve implementar todos os seus métodos abstratos.

        // Reflexão: agendar() não pode ser chamado por uma variável Notificador,
        // mesmo que ela guarde um Email, porque esse método pertence à interface Agendavel,
        // e não faz parte do contrato Notificador.
    }
}
