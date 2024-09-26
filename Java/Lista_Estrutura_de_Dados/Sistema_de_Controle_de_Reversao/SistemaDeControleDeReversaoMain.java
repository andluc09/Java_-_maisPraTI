package Java.Lista_Estrutura_de_Dados.Sistema_de_Controle_de_Reversao;

import java.util.Scanner;

public class SistemaDeControleDeReversaoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EditorTexto editor = new EditorTexto();
        int opcao;

        do {
            System.out.println("\n--- Sistema de Controle de Reversão ---\n");
            System.out.println("1. Realizar Ação");
            System.out.println("2. Desfazer Última Ação");
            System.out.println("3. Exibir Histórico de Ações");
            System.out.println("4. Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite a descrição da ação: ");
                    String descricao = scanner.nextLine();
                    editor.realizarAcao(descricao);
                    break;
                case 2:
                    editor.desfazerAcao();
                    break;
                case 3:
                    System.out.println("\nHistórico de Ações:");
                    editor.exibirHistorico();
                    break;
                case 4:
                    System.out.println("\nSaindo do sistema...");
                    return;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
            System.out.println();
        } while (opcao != 4);

        scanner.close();
    }
}
