package Java.Lista_Orientacao_Objetos.Abstracao;

abstract class FormaPagamento {
    abstract void processarPagamento(double valor);
    abstract boolean validarPagamento();
}
