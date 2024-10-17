package Java.Lista_Orientacao_Objetos.Heranca;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    // Sobrescrevendo o método calcularBonus para Gerente
    @Override
    public double calcularBonus() {
        return this.salario * 0.20; // Gerente recebe 20% de bônus
    }

    // Sobrescrevendo o método trabalhar para Gerente
    @Override
    public void trabalhar() {
        System.out.println("O gerente está gerenciando a equipe.");
    }
}
