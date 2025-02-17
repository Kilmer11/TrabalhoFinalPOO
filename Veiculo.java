public abstract class Veiculo implements Relatorio{
    private String placa;
    private double capacidade;
    private String tipoCombustivel;
    private String cor;
    private double velocidadeMedia;

    public Veiculo(String placa, double capacidade, String tipoCombustivel, String cor, double velocidadeMedia) {
        this.placa = placa;
        this.capacidade = capacidade;
        this.tipoCombustivel = tipoCombustivel;
        this.cor = cor;
        this.velocidadeMedia = velocidadeMedia;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        if(capacidade <= 0) {
			System.out.println("Capacidade informada inválida!");
			return;
		}
		this.capacidade = capacidade;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public double getVelocidadeMedia() {
		return velocidadeMedia;
	}

	public void setVelocidadeMedia(double velocidadeMedia) {
		if(velocidadeMedia <= 0) {
			System.out.println("Velocidade informada inválida!");
			return;
		}
		this.velocidadeMedia = velocidadeMedia;
	}

	public abstract void custoManutencao();
    
    public void gerarRelatorio() {
    	System.out.println("Placa: " + placa);
    	System.out.println("Capacidade: " + capacidade + "Kg");
    	System.out.println("Tipo de combustivel: " + tipoCombustivel);
    	System.out.println("cor: " + cor);
    }
}
