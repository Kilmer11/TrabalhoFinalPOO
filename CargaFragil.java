public class CargaFragil extends Carga{

	public CargaFragil(String tipo, double valor, double peso) {
		super(tipo, valor, peso);
	}

	@Override
	public void calcularSeguro() {
		System.out.println("Valor do seguro: " + (getValor() * 0.05 + getPeso() * 1.5));
	}
	
}
