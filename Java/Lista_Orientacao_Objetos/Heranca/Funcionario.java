package Java.Lista_Orientacao_Objetos.Heranca;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método para calcular bônus - será sobrescrito nas subclasses
    public double calcularBonus() {
        return 0;
    }

    // Método genérico de trabalho
    public void trabalhar() {
        System.out.println("Funcionário está trabalhando.");
    }
}