
import java.util.ArrayList;

public class OperadorLogistico {
	private String nome;
	private String identificacao;
	private ArrayList<Viagem> viagensGerenciadas;
	private ArrayList<Notificacao> notificacoes;

	public OperadorLogistico(String nome, String identificacao, ArrayList<Viagem> viagensGerenciadas, ArrayList<Notificacao> notificacaos) {
		this.nome = nome;
		this.identificacao = identificacao;
		this.viagensGerenciadas = new ArrayList<>();
		this.notificacoes = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public ArrayList<Viagem> getViagensGerenciadas() {
		return viagensGerenciadas;
	}

	public void setViagensGerenciadas(ArrayList<Viagem> viagensGerenciadas) {
		this.viagensGerenciadas = viagensGerenciadas;
	}

	public ArrayList<Notificacao> getNotificacoes() {
		return notificacoes;
	}

	public void setNotificacoes(ArrayList<Notificacao> notificacoes) {
		this.notificacoes = notificacoes;
	}
	
	public void addPontoDeParada(Viagem viagem) {
		if(!viagensGerenciadas.contains(viagem)) {
			viagensGerenciadas.add(viagem);
		}else {
			System.out.println("Viagem já está registrada!");
		}
	}
	
	public void removePontoDeParada(Viagem viagem) {
		if(viagensGerenciadas.contains(viagem)) {
			viagensGerenciadas.remove(viagem);
		}else {
			System.out.println("Viagem não encontrada!");
		}
	}
	
	public void addNotificacao(Notificacao notificacao) {
		if(!notificacoes.contains(notificacao)) {
			notificacoes.add(notificacao);
		}else {
			System.out.println("Notificação já está registrada!");
		}
	}
	
	public void removeNotificacao(Notificacao notificacao) {
		if(notificacoes.contains(notificacao)) {
			notificacoes.remove(notificacao);
		}else {
			System.out.println("Notificação não encontrada!");
		}
	}

	public void exibirInformacoes() {
		System.out.println("Nome: "+nome);
		System.out.println("Documento de identificacao: "+identificacao);
		System.out.println("Viagens Gerenciadas: ");
		for(Viagem viagem : viagensGerenciadas) {
			System.out.println("  - Viagem de"+viagem.getOrigem()+" a "+viagem.getDestino());
		}
		System.out.println("Notificações: ");
		for(Notificacao notificacao : notificacoes) {
			notificacao.exibirNotificacao();
		}
	}

}
