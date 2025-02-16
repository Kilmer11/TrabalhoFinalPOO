import java.time.LocalDate;

public class Motorista implements Relatorio {
    private String nome;
    private String numeroCNH;
    private int experiencia;
    private LocalDate dataExpiracaoCNH;
    private boolean cnhValida;

    public Motorista(String nome, String numeroCNH, int experiencia, LocalDate dataExpiracaoCNH) {
        this.nome = nome;
        this.numeroCNH = numeroCNH;
        this.experiencia = experiencia;
        this.dataExpiracaoCNH = dataExpiracaoCNH;
        this.cnhValida = validarCNH(); 
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        if(experiencia < 0){
            System.out.println("Valor inválido!");
            return;
        }
        this.experiencia = experiencia;
    }

    public LocalDate getDataExpiracaoCNH() {
        return dataExpiracaoCNH;
    }

    public void setDataExpiracaoCNH(LocalDate dataExpiracaoCNH) {
        this.dataExpiracaoCNH = dataExpiracaoCNH;
        cnhValida = validarCNH();
    }

    public boolean isCnhValida() {
        return cnhValida;
    }

    // Método para validar a CNH com base na data de expiração
    public boolean validarCNH() {
        LocalDate dataAtual = LocalDate.now();
        if (dataExpiracaoCNH.isAfter(dataAtual)) {
            System.out.println("CNH válida.");
            return true;
        } else {
            System.out.println("CNH expirada.");
            return false;
        }
    }
    
    @Override
    public void gerarRelatorio() {
        System.out.println("=== Relatório do Motorista ===");
        System.out.println("Nome: " + nome);
        System.out.println("Número da CNH: " + numeroCNH);
        System.out.println("Experiência: " + experiencia + " anos");
        System.out.println("Data de Expiração da CNH: " + dataExpiracaoCNH);
        System.out.println("CNH Válida: " + (cnhValida ? "Sim" : "Não"));
    }
}