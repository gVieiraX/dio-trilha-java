public class Facebook  extends  ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoIntenert();
        System.out.println("Enviando menssagem pelo Facebook.");
     }

    @Override
    public void receberMensagem() {
        validarConectadoIntenert();
        System.out.println("Recebendo menssagem pelo Facebook.");

    }
}
