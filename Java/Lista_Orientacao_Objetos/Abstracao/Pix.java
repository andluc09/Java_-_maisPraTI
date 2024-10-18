package Java.Lista_Orientacao_Objetos.Abstracao;

public class Pix extends FormaPagamento {
    @Override
    void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$ " + valor + " realizado via Pix.");
        } else {
            System.out.println("Falha ao processar pagamento via Pix.");
        }
    }

    @Override
    boolean validarPagamento() {
        // Lógica de validação para Pix
        System.out.println("Validando Pix...");
        // Suponha que a validação é bem-sucedida
        return true;
    }
}