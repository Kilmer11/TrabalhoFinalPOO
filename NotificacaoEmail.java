public class NotificacaoEmail extends Notificacao {
    private String remetenteEmail;

    public NotificacaoEmail(String titulo, String mensagem, String remetenteEmail) {
        super(titulo, mensagem);
        this.remetenteEmail = remetenteEmail;
    }

    @Override
    public void exibirNotificacao() {
        System.out.println("De: "+remetenteEmail);
		System.out.println("Titulo: "+getTitulo());
		System.out.println("Conteúdo: "+getMensagem());
    }
}