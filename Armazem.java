import java.util.ArrayList;

public class Armazem implements Relatorio{
    private String local;
    private double capacidadeMax;
    private ArrayList<Carga> estoque;

    public Armazem(String local, double capacidadeMax, ArrayList<Carga> estoque) {
        this.local = local;
        this.capacidadeMax = capacidadeMax;
        this.estoque = estoque;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(double capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public ArrayList<Carga> getEstoque() {
        return estoque;
    }

    public void setEstoque(ArrayList<Carga> estoque) {
        this.estoque = estoque;
    }

    public void gerarRelatorio(){
        System.out.println("Local: " + local);
        System.out.println("Capacidade máxima: " + capacidadeMax);
        System.out.println("Estoque: ");
        for(Carga carga : estoque){
            System.out.println("Carga: " + carga.getTipo());
        }
    }
}