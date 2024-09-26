package Java.Lista_Estrutura_de_Dados.Fila_de_Atendimento;

import java.util.Scanner;

public class FilaDeAtendimentoMain {
    public static void main(String[] args) {
        // Instanciando a classe Banco
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Sistema de Atendimento do Banco ---\n");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Atender Cliente");
            System.out.println("3. Listar Clientes na Fila");
            System.out.println("4. Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Captura a quebra de linha após a opção

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    banco.adicionarCliente(nomeCliente);
                    break;

                case 2:
                    banco.atenderCliente();
                    break;

                case 3:
                    banco.listarClientes();
                    break;

                case 4:
                    System.out.println("\nSaindo do sistema...");
                    return;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
