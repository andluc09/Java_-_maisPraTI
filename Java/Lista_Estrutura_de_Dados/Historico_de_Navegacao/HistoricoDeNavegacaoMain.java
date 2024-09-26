package Java.Lista_Estrutura_de_Dados.Historico_de_Navegacao;

import java.util.Scanner;

public class HistoricoDeNavegacaoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDefina o tamanho máximo do histórico de navegação: ");
        int tamanhoMaximo = scanner.nextInt();
        scanner.nextLine();  // Captura a quebra de linha

        Navegador navegador = new Navegador(tamanhoMaximo);
        int opcao;

        do {
            System.out.println("\n--- Histórico de Navegação ---\n");
            System.out.println("1. Adicionar URL ao histórico");
            System.out.println("2. Exibir histórico");
            System.out.println("3. Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Captura a quebra de linha após a escolha da opção

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite a URL para adicionar ao histórico: ");
                    String url = scanner.nextLine();
                    navegador.adicionarURL(url);
                    break;

                case 2:
                    System.out.println("\nHistórico de navegação:");
                    navegador.exibirHistorico();
                    break;

                case 3:
                    System.out.println("\nEncerrando o programa.");
                    return;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}

