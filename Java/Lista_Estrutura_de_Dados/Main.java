package Java.Lista_Estrutura_de_Dados;

import java.util.Scanner;

import Java.Lista_Estrutura_de_Dados.Editor_de_Texto.EditorDeTextoMain;
import Java.Lista_Estrutura_de_Dados.Fila_de_Atendimento.FilaDeAtendimentoMain;
import Java.Lista_Estrutura_de_Dados.Fila_de_Processos.FilaDeProcessosMain;
import Java.Lista_Estrutura_de_Dados.Gerenciador_de_Tarefas.GerenciadorDeTarefasMain;
import Java.Lista_Estrutura_de_Dados.Gerenciamento_de_Impressoes.GerenciamentoDeImpressoesMain;
import Java.Lista_Estrutura_de_Dados.Historico_de_Navegacao.HistoricoDeNavegacaoMain;
import Java.Lista_Estrutura_de_Dados.Jogo_de_Cartas.JogoDeCartasMain;
import Java.Lista_Estrutura_de_Dados.Sistema_de_Controle_de_Reversao.SistemaDeControleDeReversaoMain;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("\n--- Menu Principal ---\n");
            System.out.println("1. Gerenciador de Tarefas: Lista Simplesmente Encadeada");
            System.out.println("2. Navegador: Histórico de Navegação - Lista Simplesmente Encadeada");
            System.out.println("3. Sistema de Controle de Reversão (Undo) - Lista Simplesmente Encadeada");
            System.out.println("4. Editor de Texto - Lista Duplamente Encadeada");
            System.out.println("5. Jogo de Carta - Lista Duplamente Encadeada");
            System.out.println("6. Banco: Fila de Atendimento - Fila");
            System.out.println("7. Gerenciamento de Impressão - Fila");
            System.out.println("8. Gerenciamento de Processos - Fila");
            System.out.println("9. Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    GerenciadorDeTarefasMain.main(null);
                    break;
                case 2:
                    HistoricoDeNavegacaoMain.main(null);
                    break;
                case 3:
                    SistemaDeControleDeReversaoMain.main(null);
                    break;
                case 4:
                    EditorDeTextoMain.main(null);
                    break;
                case 5:
                    JogoDeCartasMain.main(null);
                    break;
                case 6:
                    FilaDeAtendimentoMain.main(null);
                    break;
                case 7:
                    GerenciamentoDeImpressoesMain.main(null);
                    break;
                case 8:
                    FilaDeProcessosMain.main(null);
                    break;
                case 9:
                    System.out.println("Encerrando o programa..");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 9);

        scanner.close();
    }
}