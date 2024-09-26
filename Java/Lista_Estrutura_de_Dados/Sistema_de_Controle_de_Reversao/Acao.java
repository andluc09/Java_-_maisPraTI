package Java.Lista_Estrutura_de_Dados.Sistema_de_Controle_de_Reversao;

class Acao {
    String descricao;
    Acao proxima;

    public Acao(String descricao) {
        this.descricao = descricao;
        this.proxima = null;
    }
}
