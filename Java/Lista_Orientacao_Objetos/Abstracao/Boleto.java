package Java.Lista_Orientacao_Objetos.Abstracao;

public class Boleto extends FormaPagamento {
    @Override
    void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Boleto gerado no valor de R$ " + valor + ".");
        } else {
            System.out.println("Falha ao gerar Boleto.");
        }
    }

    @Override
    boolean validarPagamento() {
        // Lógica de validação para Boleto
        System.out.println("Validando Boleto...");
        // Suponha que a validação é bem-sucedida
        return true;
    }
}
