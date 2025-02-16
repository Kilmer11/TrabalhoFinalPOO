import java.time.LocalDate;

public class Viagem {
	private Veiculo veiculo;
	private Rota rota;
	private String origem;
	private String destino;
	private LocalDate dataSaida;
	
	public Viagem(Rota rota, String origem, String destino, LocalDate dataSaida) {
		this.rota = rota;
		this.origem = origem;
		this.destino = destino;
		this.dataSaida = dataSaida;
	}

	public Rota getRota() {
		return rota;
	}

	public void setRota(Rota rota) {
		this.rota = rota;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}

    public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public void exibirInformacoes() {
        System.out.println("Origem: "+origem);
        System.out.println("Destino: "+destino);
        System.out.println("Data de saida: "+dataSaida);
    }
}
