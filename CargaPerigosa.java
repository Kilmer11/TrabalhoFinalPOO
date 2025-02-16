public class CargaPerigosa extends Carga{

	public CargaPerigosa(String tipo, double valor, double peso) {
		super(tipo, valor, peso);
	}

	@Override
	public void calcularSeguro() {
		System.out.println("Valor do seguro: " + (getValor() * 0.1 + getPeso() * 2));
	}
	
}
