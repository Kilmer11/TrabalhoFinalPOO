public class PagamentoPorDistancia implements Pagamento {
    private double distancia;
    private double tarifaPorDistancia;

    // Construtor
    public PagamentoPorDistancia(double distancia, double tarifaPorDistancia) {
        this.distancia = distancia;
        this.tarifaPorDistancia = tarifaPorDistancia;
    }

    // Cálculo do valor da viagem
    @Override
    public double calcularValorViagem() {
        return distancia * tarifaPorDistancia;
    }

    // Cálculo das taxas adicionais
    @Override
    public double calcularTaxaAdicionais() {
        return calcularValorViagem() * 0.05; // Exemplo de 5% de taxa
    }
}

