package Java.Lista_Estrutura_de_Dados.Editor_de_Texto;

import java.util.Scanner;

public class EditorDeTextoMain {
    public static void main(String[] args) {
        EditorTextoDuplo editor = new EditorTextoDuplo();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Editor de Texto ---\n");
            System.out.println("1. Escrever Ação");
            System.out.println("2. Desfazer Ação");
            System.out.println("3. Refazer Ação");
            System.out.println("4. Histórico de Ações");
            System.out.println("5. Sair");
            System.out.print("\nEscolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite a ação a ser realizada: ");
                    String acao = scanner.nextLine();
                    editor.realizarAcao(acao);
                    break;

                case 2:
                    editor.desfazerAcao();
                    break;

                case 3:
                    editor.refazerAcao();
                    break;

                case 4:
                    editor.exibirHistorico();
                    break;

                case 5:
                    System.out.println("Saindo do editor...");
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5); // Continua até o usuário escolher sair

        scanner.close();
    }
}
