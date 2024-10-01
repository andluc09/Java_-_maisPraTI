package Java.Lista_Orientacao_Objetos.Encapsulamento;

public class ProdutoDesconto {
    // Atributos privados
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor
    public ProdutoDesconto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
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

    // Método para aplicar desconto
    public void aplicarDesconto(double porcentagem) {
        if (porcentagem < 0 || porcentagem > 50) {
            throw new IllegalArgumentException("O desconto não pode ser maior que 50% ou menor que 0%.");
        }
        double desconto = preco * (porcentagem / 100);
        this.preco -= desconto; // Aplica o desconto
    }

}

