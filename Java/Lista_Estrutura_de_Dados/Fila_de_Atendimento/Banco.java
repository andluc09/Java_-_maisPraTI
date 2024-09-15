package Java.Lista_Estrutura_de_Dados.Fila_de_Atendimento;
import java.util.LinkedList;
import java.util.Queue;

public class Banco {
    Queue<String> filaClientes = new LinkedList<>();

    // Adiciona um cliente à fila
    public void adicionarCliente(String nome) {
        filaClientes.add(nome);
        System.out.println("Cliente " + nome + " adicionado à fila.");
    }

    // Atende o próximo cliente
    public void atenderCliente() {
        String clienteAtendido = filaClientes.poll();
        if (clienteAtendido != null) {
            System.out.println("Atendendo o cliente " + clienteAtendido);
        } else {
            System.out.println("Nenhum cliente na fila.");
        }
    }
}
