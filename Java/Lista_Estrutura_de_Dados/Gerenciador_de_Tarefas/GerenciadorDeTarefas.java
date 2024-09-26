package Java.Lista_Estrutura_de_Dados.Gerenciador_de_Tarefas;

public class GerenciadorDeTarefas {
    Tarefa primeira;

    // Adicionar uma nova tarefa ao final da lista
    public void adicionarTarefa(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao);
        if (primeira == null) {
            primeira = novaTarefa;
        } else {
            Tarefa atual = primeira;
            while (atual.proxima != null) {
                atual = atual.proxima;
            }
            atual.proxima = novaTarefa;
        }
    }

    // Remover a primeira tarefa não concluída
    public void removerTarefa(String descricao) {
        if (primeira != null) {
            if (primeira.descricao.equals(descricao)) {
                primeira = primeira.proxima;
            } else {
                Tarefa anterior = primeira;
                Tarefa atual = primeira.proxima;
                while (atual != null && !atual.descricao.equals(descricao)) {
                    anterior = atual;
                    atual = atual.proxima;
                }
                if (atual != null) {
                    anterior.proxima = atual.proxima;
                }
            }
        }
    }

    // Marcar uma tarefa como concluída
    public void concluirTarefa(String descricao) {
        Tarefa atual = primeira;
        while (atual != null) {
            if (atual.descricao.equals(descricao)) {
                atual.concluida = true;
                System.out.println("Tarefa '" + descricao + "' concluída.");
                return;
            }
            atual = atual.proxima;
        }
        System.out.println("Tarefa não encontrada.");
    }

    // Exibir todas as tarefas
    public void listarTarefas() {
        Tarefa atual = primeira;
        while (atual != null) {
            String status = atual.concluida ? "Concluída" : "Pendente";
            System.out.println("Tarefa: " + atual.descricao + " - " + status);
            atual = atual.proxima;
        }
    }

    // Busca uma tarefa pela descrição
    public boolean buscarTarefa(String descricao) {
        Tarefa atual = primeira;
        while (atual != null) {
            if (atual.descricao.equals(descricao)) {
                return true;  // A tarefa foi encontrada
            }
            atual = atual.proxima;
        }
        return false;  // A tarefa não foi encontrada
    }
}