package Java.Lista_Estrutura_de_Dados.Fila_de_Processos;
import java.util.LinkedList;
import java.util.Queue;

public class GerenciamentoProcessos {
    Queue<String> filaProcessos = new LinkedList<>();

    // Adiciona um processo à fila
    public void adicionarProcesso(String processo) {
        filaProcessos.add(processo);
        System.out.println("Processo '" + processo + "' adicionado à fila.");
    }

    // Remove e executa o processo mais antigo
    public void executarProcesso() {
        String processo = filaProcessos.poll();
        if (processo != null) {
            System.out.println("Executando processo: " + processo);
        } else {
            System.out.println("Nenhum processo para executar.");
        }
    }
}

