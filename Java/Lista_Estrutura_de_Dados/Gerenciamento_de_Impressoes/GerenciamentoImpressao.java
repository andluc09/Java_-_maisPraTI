package Java.Lista_Estrutura_de_Dados.Gerenciamento_de_Impressoes;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class GerenciamentoImpressao {
    Queue<String> filaImpressao = new LinkedList<>();
    ArrayList<String> historicoImpressao = new ArrayList<>(); // Lista para armazenar o histórico

    // Adiciona um trabalho de impressão à fila
    public void adicionarTrabalho(String documento) {
        filaImpressao.add(documento);
        System.out.println("Documento '" + documento + "' adicionado à fila.");
    }

    // Processa o próximo trabalho de impressão
    public void processarImpressao() {
        String documento = filaImpressao.poll();
        if (documento != null) {
            System.out.println("Imprimindo documento: " + documento);
            historicoImpressao.add(documento); // Adiciona ao histórico
        } else {
            System.out.println("Nenhum trabalho de impressão na fila.");
        }
    }

    // Exibe o histórico de impressões
    public void exibirHistoricoImpressao() {
        if (historicoImpressao.isEmpty()) {
            System.out.println("Nenhum documento foi impresso até agora.");
            return; // Retorna se não houver histórico
        }

        System.out.println("Histórico de Impressões:");
        for (String documento : historicoImpressao) {
            System.out.println(documento);
        }
    }
}
