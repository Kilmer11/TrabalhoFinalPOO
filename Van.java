public class Van extends Veiculo {

	public Van(String placa, double capacidade, String tipoCombustivel, String cor, double velocidadeMedia) {
		super(placa, capacidade, tipoCombustivel, cor, velocidadeMedia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void custoManutencao() {
		// TODO Auto-generated method stub
		System.out.println("Custo de manutenção: " + getCapacidade() * 7);
	}

}
