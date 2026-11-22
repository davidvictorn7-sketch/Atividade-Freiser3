public class CentralDeAvisos {
    public void avisar(Notificador canal, String mensagem) {
        System.out.println("Enviando por " + canal.getCanal() + "...");
        canal.enviar(mensagem);
    }

    public void avisarTodos(Notificador[] canais, String mensagem) {
        for (Notificador canal : canais) {
            avisar(canal, mensagem);
        }
        System.out.println("Total de canais avisados: " + canais.length);
    }
}
