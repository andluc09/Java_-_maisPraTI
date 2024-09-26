package Java.Lista_Estrutura_de_Dados.Gerenciador_de_Tarefas;

import java.util.Scanner;

public class GerenciadorDeTarefasMain {
    public static void main(String[] args) {
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Gerenciador de Tarefas ---\n");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Concluir Tarefa");
            System.out.println("3. Remover Tarefa");
            System.out.println("4. Listar Tarefas");
            System.out.println("5. Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite a descrição da nova tarefa: ");
                    String descricaoTarefa = scanner.nextLine();
                    gerenciador.adicionarTarefa(descricaoTarefa);
                    System.out.println("\nTarefa adicionada: " + descricaoTarefa);
                    break;

                case 2:
                    System.out.print("\nDigite a descrição da tarefa a ser concluída: ");
                    String descricaoConcluir = scanner.nextLine();
                    gerenciador.concluirTarefa(descricaoConcluir);
                    break;

                case 3:
                    System.out.print("\nDigite a descrição da tarefa a ser removida: ");
                    String descricaoRemover = scanner.nextLine();

                    if (gerenciador.buscarTarefa(descricaoRemover)) {
                        gerenciador.removerTarefa(descricaoRemover);
                        System.out.println("Tarefa removida: " + descricaoRemover);
                    } else {
                        System.out.println("Essa tarefa não foi encontrada!");
                    }
                    break;

                case 4:
                    System.out.println("\nListando todas as tarefas:");
                    gerenciador.listarTarefas();
                    break;

                case 5:
                    System.out.println("\nEncerrando o programa.");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
