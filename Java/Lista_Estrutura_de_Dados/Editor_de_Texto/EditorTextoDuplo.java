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
}