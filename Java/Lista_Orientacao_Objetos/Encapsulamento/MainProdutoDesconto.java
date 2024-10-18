package Java.Lista_Orientacao_Objetos.Encapsulamento;

import java.util.Scanner;

public class MainProdutoDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.println("\nDigite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.println("\nDigite a quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        ProdutoDesconto produto = new ProdutoDesconto(nome, preco, quantidade);

        System.out.println("\nPreço original: " + produto.getPreco());

        System.out.println("\nDigite o percentual de desconto a ser aplicado: ");
        double desconto = scanner.nextDouble();

        try {
            produto.aplicarDesconto(desconto);
            System.out.println("\nPreço após desconto de " + desconto + "%: " + produto.getPreco());
        } catch (IllegalArgumentException e) {
            System.out.println("\nErro ao aplicar desconto: " + e.getMessage());
        }
    }
}

