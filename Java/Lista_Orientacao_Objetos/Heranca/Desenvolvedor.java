package Java.Lista_Orientacao_Objetos.Heranca;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    // Sobrescrevendo o método calcularBonus para Desenvolvedor
    @Override
    public double calcularBonus() {
        return this.salario * 0.10; // Desenvolvedor recebe 10% de bônus
    }

    // Sobrescrevendo o método trabalhar para Desenvolvedor
    @Override
    public void trabalhar() {
        System.out.println("O desenvolvedor está escrevendo código.");
    }
}