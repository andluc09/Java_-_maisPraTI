package Java.Lista_Estrutura_de_Dados.Historico_de_Navegacao;

public class HistoricoNavegacao {
    String url;
    HistoricoNavegacao proximo;

    public HistoricoNavegacao(String url) {
        this.url = url;
        this.proximo = null;
    }
}