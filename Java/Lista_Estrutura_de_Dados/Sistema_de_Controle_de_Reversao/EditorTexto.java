package Java.Lista_Estrutura_de_Dados.Sistema_de_Controle_de_Reversao;

class EditorTexto {
    Acao primeiraAcao;

    // Adiciona uma nova ação
    public void realizarAcao(String descricao) {
        Acao novaAcao = new Acao(descricao);
        novaAcao.proxima = primeiraAcao;
        primeiraAcao = novaAcao;
    }

    // Desfaz a última ação
    public void desfazerAcao() {
        if (primeiraAcao != null) {
            System.out.println("Desfazendo ação: " + primeiraAcao.descricao);
            primeiraAcao = primeiraAcao.proxima;
        } else {
            System.out.println("Nenhuma ação para desfazer.");
        }
    }

    // Exibe o histórico de ações
    public void exibirHistorico() {
        if (primeiraAcao == null) {
            System.out.println("Não foi encontrada nenhuma ação!");
            return; // Retorna se não houver ações
        }

        Acao atual = primeiraAcao;
        while (atual != null) {
            System.out.println(atual.descricao);
            atual = atual.proxima;
        }
    }
}

