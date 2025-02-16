public class PagamentoPorPeso implements Pagamento {
    private double peso;
    private double tarifaPorPeso;

    //Construtor
    public PagamentoPorPeso(double peso, double tarifaPorPeso) {
        this.peso = peso;
        this.tarifaPorPeso = tarifaPorPeso;
    }

    //Cálulo do valor da viagem
    @Override
    public double calcularValorViagem() {
        return peso * tarifaPorPeso;
    }
    //Cálculo taxas adicionais
    @Override
    public double calcularTaxaAdicionais() {
        return calcularValorViagem()*0.05;
    } 
}
