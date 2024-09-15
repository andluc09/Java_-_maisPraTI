package Java.Lista_Estrutura_de_Dados.Historico_de_Navegacao;

public class Navegador {
    HistoricoNavegacao primeiro;
    int tamanhoMaximo;
    int tamanhoAtual;

    public Navegador(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.tamanhoAtual = 0;
    }

    // Adiciona uma nova URL ao histórico
    public void adicionarURL(String url) {
        HistoricoNavegacao novaURL = new HistoricoNavegacao(url);
        if (tamanhoAtual == tamanhoMaximo) {
            removerPrimeiraURL(); // Se o histórico estiver cheio, remove a mais antiga
        }
        if (primeiro == null) {
            primeiro = novaURL;
        } else {
            HistoricoNavegacao atual = primeiro;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novaURL;
        }
        tamanhoAtual++;
    }

    // Remove a primeira URL (a mais antiga) do histórico
    public void removerPrimeiraURL() {
        if (primeiro != null) {
            primeiro = primeiro.proximo;
            tamanhoAtual--;
        }
    }

    // Exibe o histórico
    public void exibirHistorico() {
        HistoricoNavegacao atual = primeiro;
        while (atual != null) {
            System.out.println(atual.url);
            atual = atual.proximo;
        }
    }
}