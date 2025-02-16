public class cargaFragil extends Carga{

	public cargaFragil(String tipo, double valor, double peso) {
		super(tipo, valor, peso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularSeguro() {
		// TODO Auto-generated method stub
		System.out.println("Valor do seguro: " + (getValor() * 0.05 + getPeso() * 1.5));
	}
	
}
