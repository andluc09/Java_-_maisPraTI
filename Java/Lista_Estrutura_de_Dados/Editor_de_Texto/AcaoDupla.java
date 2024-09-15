package Java.Lista_Estrutura_de_Dados.Editor_de_Texto;

public class AcaoDupla {
    String descricao;
    AcaoDupla anterior;
    AcaoDupla proxima;

    public AcaoDupla(String descricao) {
        this.descricao = descricao;
        this.anterior = null;
        this.proxima = null;
    }
}