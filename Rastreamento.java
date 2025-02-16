import java.time.LocalDate;

public class Rastreamento {
    private Veiculo veiculo;
    private String localizacao;
    private LocalDate ultimaData;
    private String ultimaHora;
    
    public Rastreamento(Veiculo veiculo, String localizacao, LocalDate ultimaData, String ultimaHora) {
        this.veiculo = veiculo;
        this.localizacao = localizacao;
        this.ultimaData = ultimaData;
        this.ultimaHora = ultimaHora;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getCoordenadasGPS() {
        return localizacao;
    }

    public void setCoordenadasGPS(String localizacao) {
        this.localizacao = localizacao;
    }

    public LocalDate getUltimaData() {
        return ultimaData;
    }

    public void setUltimaData(LocalDate ultimaData) {
        this.ultimaData = ultimaData;
    }

    public String getUltimaHora() {
        return ultimaHora;
    }

    public void setUltimaHora(String ultimaHora) {
        this.ultimaHora = ultimaHora;
    }

    public void exibirInformacoes() {
        System.out.println("R A S T R E A M E N T O");
        System.out.println("Placa do veículo registrado: "+veiculo.getPlaca());
        System.out.println("Ultima localização registrada: "+localizacao);
        System.out.println("Data: "+ultimaData);
        System.out.println("Hora: "+ultimaHora+"h");
    }
}