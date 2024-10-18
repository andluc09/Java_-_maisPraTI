package Java.Lista_Orientacao_Objetos.Abstracao;

public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return salario;
    }

    @Override
    public double calcularBonus() {
        return 0; // Estagiários não recebem bônus
    }
}