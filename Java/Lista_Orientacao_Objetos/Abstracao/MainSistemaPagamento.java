package Java.Lista_Orientacao_Objetos.Abstracao;

import java.util.Scanner;

public class MainSistemaPagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a forma de pagamento: 1 - Cartão de Crédito, 2 - Boleto, 3 - Pix");
        int opcao = scanner.nextInt();

        FormaPagamento formaPagamento = null;

        // Escolha da forma de pagamento com base na entrada do usuário
        switch (opcao) {
            case 1:
                formaPagamento = new CartaoCredito();
                break;
            case 2:
                formaPagamento = new Boleto();
                break;
            case 3:
                formaPagamento = new Pix();
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("Informe o valor do pagamento:");
        double valor = scanner.nextDouble();

        // Processar o pagamento com a forma escolhida
        formaPagamento.processarPagamento(valor);
    }
}

