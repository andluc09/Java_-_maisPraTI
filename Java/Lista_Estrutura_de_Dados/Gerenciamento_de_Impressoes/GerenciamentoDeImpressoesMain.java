package Java.Lista_Estrutura_de_Dados.Gerenciamento_de_Impressoes;

import java.util.Scanner;

public class GerenciamentoDeImpressoesMain {
    public static void main(String[] args) {
        GerenciamentoImpressao gerenciamento = new GerenciamentoImpressao();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Gerenciamento de Impressões ---\n");
            System.out.println("1. Adicionar trabalho de impressão");
            System.out.println("2. Processar próximo trabalho de impressão");
            System.out.println("3. Histórico de Impressões");
            System.out.println("4. Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Captura a quebra de linha após a escolha da opção

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome do documento a ser impresso: ");
                    String documento = scanner.nextLine();
                    gerenciamento.adicionarTrabalho(documento);
                    break;

                case 2:
                    gerenciamento.processarImpressao();
                    break;

                case 3:
                    gerenciamento.exibirHistoricoImpressao();
                    break;

                case 4:
                    System.out.println("\nEncerrando o programa.");
                    return;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
