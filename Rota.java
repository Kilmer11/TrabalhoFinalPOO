import java.util.ArrayList;

public class Rota implements Relatorio{
	private double distancia;
	private ArrayList<String> pontosDeParada;
	private String condicaoEstrada;
	private Veiculo veiculo;
	
	public Rota(double distancia, ArrayList<String> pontosDeParada, String condicaoEstrada, Veiculo veiculo) {
		this.distancia = distancia;
		this.pontosDeParada = pontosDeParada;
		this.condicaoEstrada = condicaoEstrada;
		this.veiculo = veiculo;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		if(distancia > 0) {			
			this.distancia = distancia;
		}else{
			System.out.println("Distância informada inválida");
		}
	}

	public ArrayList<String> getPontosDeParada() {
		return pontosDeParada;
	}

	public void setPontosDeParada(ArrayList<String> pontosDeParada) {
		this.pontosDeParada = pontosDeParada;
	}

	public String getCondicaoEstrada() {
		return condicaoEstrada;
	}

	public void setCondicaoEstrada(String condicaoEstrada) {
		this.condicaoEstrada = condicaoEstrada;
	}
	
	public void addPontoDeParada(String parada) {
		if(!pontosDeParada.contains(parada)) {
			pontosDeParada.add(parada);
		}else {
			System.out.println("Ponto de parada ja registrado!");
		}
	}
	
	public void removePontoDeParada(String parada) {
		if(pontosDeParada.contains(parada)) {
			pontosDeParada.remove(parada);
		}else {
			System.out.println("Ponto de parada não existe!");
		}
	}
	
	public double calcTempo() {
		double penalidade = 0;
		double tempo = 0;
		
		if(condicaoEstrada == "Ruim") {
			penalidade = 2;
		}else if(condicaoEstrada == "Média") {
			penalidade = 1.5;
		}else if(condicaoEstrada == "Boa") {
			penalidade = 1;
		}
		
		tempo = distancia / (veiculo.getVelocidadeMedia() / penalidade);
		
		return tempo;
	}
	
	public void gerarRelatorio() {
		System.out.println("Distância: "+distancia+"km");
		System.out.println("Pontos de parada: ");
		for(String ponto : pontosDeParada) {
			System.out.println("  - "+ponto);
		}
		System.out.println("Condição da estrada: "+condicaoEstrada);
	}
}
