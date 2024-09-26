package Java.Lista_Estrutura_de_Dados.Fila_de_Processos;

import java.util.Scanner;

public class FilaDeProcessosMain {
    public static void main(String[] args) {
        // Instancia a classe de gerenciamento de processos
        GerenciamentoProcessos gerenciamento = new GerenciamentoProcessos();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Gerenciamento de Processos ---\n");
            System.out.println("1. Adicionar Processo");
            System.out.println("2. Executar Processo");
            System.out.println("3. Listar Processos");
            System.out.println("4. Sair");
            System.out.print("\nEscolha uma opção: ");

            // Lê a opção do usuário
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome do processo a ser adicionado: ");
                    String nomeProcesso = scanner.nextLine();
                    gerenciamento.adicionarProcesso(nomeProcesso);
                    System.out.println("Processo adicionado: " + nomeProcesso);
                    break;

                case 2:
                    gerenciamento.executarProcesso();
                    break;

                case 3:
                    gerenciamento.listarProcessos(); // Supondo que você tenha um método para listar processos
                    break;

                case 4:
                    System.out.println("\nSaindo do gerenciamento de processos...");
                    return;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        } while (opcao != 4); // Continua até o usuário escolher sair

        scanner.close();
    }
}
