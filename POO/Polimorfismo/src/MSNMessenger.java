public class MSNMessenger  extends  ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoIntenert();
        System.out.println("Enviando menssagem pelo MSN.");

    }

    @Override
    public void receberMensagem() {
        validarConectadoIntenert();
        System.out.println("Recebendo menssagem pelo MSN.");
    }
}
