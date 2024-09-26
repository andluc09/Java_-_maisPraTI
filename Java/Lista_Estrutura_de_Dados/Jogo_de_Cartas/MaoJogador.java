package Java.Lista_Estrutura_de_Dados.Jogo_de_Cartas;

public class MaoJogador {
    Carta primeira;
    Carta ultima;

    // Adiciona uma nova carta à mão
    public void adicionarCarta(String nome) {
        Carta novaCarta = new Carta(nome);
        if (primeira == null) {
            primeira = novaCarta;
            ultima = novaCarta;
        } else {
            ultima.proxima = novaCarta;
            novaCarta.anterior = ultima;
            ultima = novaCarta;
        }
    }

    // Remove uma carta da mão
    public void removerCarta(String nome) {
        Carta atual = primeira;
        while (atual != null) {
            if (atual.nome.equals(nome)) {
                // A carta foi encontrada, removendo-a
                if (atual == primeira) {
                    primeira = atual.proxima;
                    if (primeira != null) primeira.anterior = null;
                } else if (atual == ultima) {
                    ultima = atual.anterior;
                    if (ultima != null) ultima.proxima = null;
                } else {
                    atual.anterior.proxima = atual.proxima;
                    atual.proxima.anterior = atual.anterior;
                }
                System.out.println("Carta '" + nome + "' removida com sucesso.");
                return;
            }
            atual = atual.proxima;
        }
        // Se a carta não for encontrada
        System.out.println("Carta não encontrada!");
    }

    // Exibe a mão do jogador
    public void exibirMao() {
        Carta atual = primeira;
        while (atual != null) {
            System.out.println(atual.nome);
            atual = atual.proxima;
        }
    }
}