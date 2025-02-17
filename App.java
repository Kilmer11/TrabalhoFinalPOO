import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        CaminhaoLeve caminhao1 = new CaminhaoLeve("PXE2A19", 200,
        "Gasolina", "Verde", 60);
        CaminhaoPesado caminhao2 = new CaminhaoPesado("HGT9N21", 300, "Diesel", "Azul", 80);
        Van van = new Van("KLW9R92", 120, "Gasolina", "Branca", 100);

        System.out.println("----Veiculos----");
        System.out.println("--Caminhao Leve--");
        caminhao1.gerarRelatorio();
        caminhao1.custoManutencao();

        System.out.println("--Caminhao Pesado--");
        caminhao2.gerarRelatorio();
        caminhao2.custoManutencao();

        System.out.println("--Van--");
        van.gerarRelatorio();
        van.custoManutencao();

        System.out.println("--Rota--");
        ArrayList<String> pontosParada = new ArrayList<>();
        pontosParada.add("Acopiara");
        pontosParada.add("Piquet Carneiro");
        pontosParada.add("Quixada");
        Rota rota1 = new Rota(200, pontosParada, "Boa", caminhao1);
        rota1.gerarRelatorio();

        System.out.println("--Viagem--");
        Viagem viagem = new Viagem(rota1, "Jucás", "Fortaleza", LocalDate.of(2025, 1, 13));
        viagem.gerarRelatorio();

        System.out.println("--Motorista--");
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(van);
        veiculos.add(caminhao1);
        Motorista mot1 = new Motorista("Bruno", "21923123", 2, LocalDate.of(2027, 8, 27), veiculos);
        mot1.gerarRelatorio();

        System.out.println("--Manutencao--");
        Manutencao man1 = new Manutencao(van, LocalDate.now(), "Troca de pneu", 30);
        man1.gerarRelatorio();

        System.out.println("--Cargas--");
        CargaPerigosa carga1 = new CargaPerigosa("Inflamável", 2500, 300);
        CargaFragil carga2 = new CargaFragil("Vidro", 1000, 200);

        System.out.println("-Carga 1-");
        carga1.gerarRelatorio();
        carga1.calcularSeguro();

        System.out.println("-Carga 2-");
        carga2.gerarRelatorio();
        carga2.calcularSeguro();

        System.out.println("--Pagamentos--");
        PagamentoPorDistancia pagamento1 = new PagamentoPorDistancia(200, 5);
        PagamentoPorPeso pagamento2 = new PagamentoPorPeso(600, 7);

        System.out.println("Pagamento 1");
        pagamento1.calcularValorViagem();
        pagamento1.calcularTaxaAdicionais();

        System.out.println("Pagamento 2");
        pagamento2.calcularValorViagem();
        pagamento2.calcularTaxaAdicionais();

        System.out.println("--Notificacoes--");
        NotificacaoEmail not1 = new NotificacaoEmail("Aviso!", "Cuidado com a carga x", "isayde@gmail.com");
        NotificacaoSMS not2 = new NotificacaoSMS("Comunicado", "Hoje iremos fechar as 16h", 992939291);

        System.out.println("Notifiçao 1");
        not1.exibirNotificacao();

        System.out.println("Notifiçao 2");
        not2.exibirNotificacao();

        System.out.println("--Operador Logistico--");
        ArrayList<Viagem> viagens = new ArrayList<>();
        viagens.add(viagem);
        ArrayList<Notificacao> notificacoes = new ArrayList<>();
        notificacoes.add(not2);
        notificacoes.add(not1);
        OperadorLogistico op1 = new OperadorLogistico("Italo", "203102313", viagens, notificacoes);
        op1.gerarRelatorio();

        System.out.println("--Rastreamento--");
        Rastreamento ras1 = new Rastreamento(caminhao1, "Mombaça", LocalDate.of(2025, 12, 23), "20h");
        ras1.exibirInformacoes();
    }
}
