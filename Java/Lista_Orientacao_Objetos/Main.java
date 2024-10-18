package Java.Lista_Orientacao_Objetos;

import java.util.Scanner;

import Java.Lista_Orientacao_Objetos.Encapsulamento.MainProduto;
import Java.Lista_Orientacao_Objetos.Encapsulamento.MainProdutoDesconto;
import Java.Lista_Orientacao_Objetos.Heranca.MainHeranca;
import Java.Lista_Orientacao_Objetos.Polimorfismo.MainPolimorfismoInterface;
import Java.Lista_Orientacao_Objetos.Polimorfismo.MainPolimorfismoClasseAbstrata;
import Java.Lista_Orientacao_Objetos.Abstracao.MainSistemaPagamento;
import Java.Lista_Orientacao_Objetos.Abstracao.MainSistemaGestaoFuncionarios;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("\n--- Menu Principal ---\n");
            System.out.println("\n\n--- Encapsulamento ---\n");
            System.out.println("1. Criação de uma Classe Simples com Validação");
            System.out.println("2. Melhorando a Classe com Validação");
            System.out.println("\n\n--- Herança ---\n");
            System.out.println("3. Criação de uma Hierarquia de Classes");
            System.out.println("\n\n--- Polimorfismo ---\n");
            System.out.println("4. Polimorfismo com Interfaces");
            System.out.println("5. Polimorfismo com Classes Abstratas");
            System.out.println("\n\n--- Abstração ---\n");
            System.out.println("6. Abstração em um Sistema de Pagamentos");
            System.out.println("7. Sistema de Gestão de Funcionários");
            System.out.println("\n\n--- Sair ---\n");
            System.out.println("8. Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    MainProduto.main(null);
                    break;
                case 2:
                    MainProdutoDesconto.main(null);
                    break;
                case 3:
                    MainHeranca.main(null);
                    break;
                case 4:
                    MainPolimorfismoInterface.main(null);
                    break;
                case 5:
                    MainPolimorfismoClasseAbstrata.main(null);
                    break;
                case 6:
                    MainSistemaPagamento.main(null);
                    break;
                case 7:
                    MainSistemaGestaoFuncionarios.main(null);
                    break;
                case 8:
                    System.out.println("Encerrando o programa..");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 8);

        scanner.close();
    }
}