package Java.Lista_Orientacao_Objetos.Abstracao;

public class PromocaoFuncionario {
    public Funcionario promover(Funcionario funcionario, String novoCargo) {
        switch (novoCargo.toLowerCase()) {
            case "gerente":
                System.out.println("Promovendo " + funcionario.getNome() + " a Gerente.");
                return new Gerente(funcionario.getNome(), funcionario.getSalario() * 1.5); // Novo salário maior
            case "desenvolvedor":
                System.out.println("Promovendo " + funcionario.getNome() + " a Desenvolvedor.");
                return new Desenvolvedor(funcionario.getNome(), funcionario.getSalario() * 1.2); // Aumento no salário
            case "estagiario":
                System.out.println("Promovendo " + funcionario.getNome() + " a Estagiário.");
                return new Estagiario(funcionario.getNome(), funcionario.getSalario()); // Sem mudança no salário
            default:
                System.out.println("Cargo inválido.");
                return funcionario;
        }
    }
}


