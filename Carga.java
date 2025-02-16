public abstract class Carga {
	private String tipo;
	private double valor;
	private double peso;
	
	public Carga(String tipo, double valor, double peso) {
		this.tipo = tipo;
		this.valor = valor;
		this.peso = peso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if(valor <= 0) {
			System.out.println("Valor inválido!");
			return;
		}
		this.valor = valor;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso <= 0) {
			System.out.println("Peso inválido!");
			return;
		}
		this.peso = peso;
	}
	
	public abstract void calcularSeguro();
	
}
