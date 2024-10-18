package Java.Lista_Orientacao_Objetos.Abstracao;

public class CartaoCredito extends FormaPagamento {
    @Override
    void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$ " + valor + " realizado com Cartão de Crédito.");
        } else {
            System.out.println("Falha ao processar pagamento com Cartão de Crédito.");
        }
    }

    @Override
    boolean validarPagamento() {
        // Lógica de validação para Cartão de Crédito
        System.out.println("Validando Cartão de Crédito...");
        // Suponha que a validação é bem-sucedida
        return true;
    }
}
