package Java.Lista_Estrutura_de_Dados.Editor_de_Texto;

public class EditorTextoDuplo {
    AcaoDupla atual;

    // Realiza uma nova ação
    public void realizarAcao(String descricao) {
        AcaoDupla novaAcao = new AcaoDupla(descricao);
        if (atual != null) {
            atual.proxima = novaAcao;
            novaAcao.anterior = atual;
        }
        atual = novaAcao;
        System.out.println("\nAção realizada: " + atual.descricao);
    }

    // Desfaz a última ação
    public void desfazerAcao() {
        if (atual != null) {
            System.out.println("Desfazendo: " + atual.descricao);
            atual = atual.anterior;
        } else {
            System.out.println("Nada para desfazer.");
        }
    }

    // Refaz a próxima ação
    public void refazerAcao() {
        if (atual != null && atual.proxima != null) {
            atual = atual.proxima;
            System.out.println("Refazendo: " + atual.descricao);
        } else {
            System.out.println("Nada para refazer.");
        }
    }

    // Exibe o histórico de ações
    public void exibirHistorico() {
        if (atual == null) {
            System.out.println("Não foi encontrada nenhuma ação!");
        }

        AcaoDupla temp = atual; // Começa do atual
        // Percorre para trás até a primeira ação
        while (temp != null) {
            System.out.println(temp.descricao);
            temp = temp.anterior;
        }
    }
}