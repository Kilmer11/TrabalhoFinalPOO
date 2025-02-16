public class Motorista implements Relatorio{
    private String nome;
    private String numeroCNH;
    private int experiencia;
    private boolean prazoDeValidade;
    private boolean cnhValida;

    // Construtor
    public Motorista(String nome, String numeroCNH, int experiencia, boolean cnhValida) {
        this.nome = nome;
        this.numeroCNH = numeroCNH;
        this.experiencia = experiencia;
        this.cnhValida = cnhValida;
    }

    // Getters e Setters
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
        this.experiencia = experiencia;
    }

    public boolean isCnhValida() {
        return cnhValida;
    }

    public void setCnhValida(boolean cnhValida) {
        this.cnhValida = cnhValida;
    }

    // Método para validar a CNH
    public boolean validarCNH() {
        // Aqui você pode colocar uma lógica mais complexa de validação
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

    // Método para exibir informações do motorista
    gerarRelatorio();
}

