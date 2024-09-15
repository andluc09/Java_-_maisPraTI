package Java.Lista_Estrutura_de_Dados.Jogo_de_Cartas;

public class Carta {
    String nome;
    Carta anterior;
    Carta proxima;

    public Carta(String nome) {
        this.nome = nome;
        this.anterior = null;
        this.proxima = null;
    }
}