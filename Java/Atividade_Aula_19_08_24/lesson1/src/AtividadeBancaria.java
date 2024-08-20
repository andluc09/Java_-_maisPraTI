package Java.Atividade_Aula_19_08_24.lesson1.src;

public class AtividadeBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("0011122-5", "Arthur ", "Corrente", "00159", 105000.00, "Ativa", "2024-08-19", 5000000.00);

        conta.sacar(10000.00);

        conta.depositar(20000.00);

        conta.transferir(4000.00, conta);

        System.out.println(conta.getHistoricoTransacao());
        conta.extrato();
    }
}
