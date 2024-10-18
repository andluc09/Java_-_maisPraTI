package Java.Lista_Orientacao_Objetos.Encapsulamento;

import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.println("\nDigite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.println("\nDigite a quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println("\nNome do produto: " + produto.getNome());
        System.out.println("\nPreço: " + produto.getPreco());
        System.out.println("\nQuantidade em estoque: " + produto.getQuantidadeEstoque());

        System.out.println("\nDigite o novo preço: ");
        produto.setPreco(scanner.nextDouble());

        System.out.println("\nDigite a nova quantidade em estoque: ");
        produto.setQuantidadeEstoque(scanner.nextInt());

        System.out.println("\nPreço atualizado: " + produto.getPreco());
        System.out.println("\nQuantidade em estoque atualizada: " + produto.getQuantidadeEstoque());
    }
}
