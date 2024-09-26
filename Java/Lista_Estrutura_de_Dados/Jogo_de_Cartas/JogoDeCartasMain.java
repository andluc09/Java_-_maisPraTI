package Java.Lista_Estrutura_de_Dados.Jogo_de_Cartas;

import java.util.Scanner;

public class JogoDeCartasMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaoJogador maoJogador = new MaoJogador();
        int opcao;

        do {
            System.out.println("\n--- Jogo de Cartas ---\n");
            System.out.println("1. Adicionar carta à mão");
            System.out.println("2. Remover carta da mão");
            System.out.println("3. Exibir mão do jogador");
            System.out.println("4. Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Captura a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome da carta para adicionar: ");
                    String nomeCartaAdicionar = scanner.nextLine();
                    maoJogador.adicionarCarta(nomeCartaAdicionar);
                    break;

                case 2:
                    System.out.print("\nDigite o nome da carta para remover: ");
                    String nomeCartaRemover = scanner.nextLine();
                    maoJogador.removerCarta(nomeCartaRemover);
                    break;

                case 3:
                    System.out.println("\nMão do jogador:");
                    maoJogador.exibirMao();
                    break;

                case 4:
                    System.out.println("\nEncerrando o jogo.");
                    return;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
