import java.time.LocalDate;

public class Manutencao {
	private Veiculo veiculo;
	private LocalDate data;
	private String tipoManutencao;
	private double custo;
	
	public Manutencao(Veiculo veiculo, LocalDate data, String tipoManutencao, double custo) {
		this.veiculo = veiculo;
		this.data = data;
		this.tipoManutencao = tipoManutencao;
		this.custo = custo;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getTipoManutencao() {
		return tipoManutencao;
	}

	public void setTipoManutencao(String tipoManutencao) {
		this.tipoManutencao = tipoManutencao;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		if(custo <= 0) {
			System.out.println("Custo inválido!");
			return;
		}
		this.custo = custo;
	}
	
	public void exebirInformacoes(){
		System.out.println("Data: " + data);
		System.out.println("Tipo de manutenção: " + tipoManutencao);
		System.out.println("Custo: " + custo);
	}

}
