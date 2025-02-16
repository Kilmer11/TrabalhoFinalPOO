public class CargaPerigosa extends Carga{

	public CargaPerigosa(String tipo, double valor, double peso) {
		super(tipo, valor, peso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularSeguro() {
		// TODO Auto-generated method stub
		System.out.println("Valor do seguro: " + (getValor() * 0.1 + getPeso() * 2));
	}
	
}
