package Java.Lista_Orientacao_Objetos.Heranca;

public class MainHeranca {
    public static void main(String[] args) {
        // Criando instâncias de Gerente e Desenvolvedor
        Gerente gerente = new Gerente("Ana", 8000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Carlos", 5000);

        // Exibindo informações e cálculos de bônus
        System.out.println("Gerente " + gerente.nome + " tem bônus de: " + gerente.calcularBonus());
        gerente.trabalhar();

        System.out.println("Desenvolvedor " + desenvolvedor.nome + " tem bônus de: " + desenvolvedor.calcularBonus());
        desenvolvedor.trabalhar();
    }
}
