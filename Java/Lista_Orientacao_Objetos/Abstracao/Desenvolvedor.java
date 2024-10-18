package Java.Lista_Orientacao_Objetos.Abstracao;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return salario;
    }

    @Override
    public double calcularBonus() {
        return salario * 0.1; // 10% de bônus
    }
}