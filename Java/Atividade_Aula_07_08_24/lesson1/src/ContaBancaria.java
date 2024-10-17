package Java.Atividade_Aula_07_08_24.lesson1.src;

public class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        this.saldo = valor;
    }

    public double consultaSaldo() {
        return saldo;
    }
}
