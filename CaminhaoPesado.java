public class CaminhaoPesado extends Veiculo{

	public CaminhaoPesado(String placa, double capacidade, String tipoCombustivel, String cor, double velocidadeMedia) {
		super(placa, capacidade, tipoCombustivel, cor, velocidadeMedia);
	}

	@Override
	public void custoManutencao() {
		System.out.println("Custo de manutenção: " + getCapacidade() * 16);
	}

}
