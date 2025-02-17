public class NotificacaoSMS extends Notificacao {
	private int numeroRemetente;
	
	public NotificacaoSMS(String titulo, String mensagem, int numeroRemetente) {
		super(titulo, mensagem);
		this.numeroRemetente = numeroRemetente;
	}

	@Override
	public void exibirNotificacao() {
		System.out.println("De: "+numeroRemetente);
		System.out.println("Titulo: "+getTitulo());
		System.out.println("Conteúdo: "+getMensagem());
	}
}
