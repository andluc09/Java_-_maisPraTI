package Java.Lista_Orientacao_Objetos.Encapsulamento;

public class Produto {
    // Atributos privados
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        setPreco(preco); // Validação no setter
        setQuantidadeEstoque(quantidadeEstoque); // Validação no setter
    }

    // Métodos públicos de acesso (getters)
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    // Métodos públicos de modificação (setters)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa.");
        }
    }
}
