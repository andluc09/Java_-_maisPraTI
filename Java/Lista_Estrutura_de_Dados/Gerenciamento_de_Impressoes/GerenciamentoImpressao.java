package Java.Lista_Estrutura_de_Dados.Gerenciamento_de_Impressoes;
import java.util.LinkedList;
import java.util.Queue;

public class GerenciamentoImpressao {
    Queue<String> filaImpressao = new LinkedList<>();

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
        } else {
            System.out.println("Nenhum trabalho de impressão na fila.");
        }
    }
}
