package Java.Lista_Orientacao_Objetos.Abstracao;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSistemaGestaoFuncionarios {
    public static void main(String[] args) {
        // Scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Lista de funcionários
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Quantos funcionários deseja adicionar?");
        int numeroFuncionarios = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha

        // Adicionando funcionários com base na entrada do usuário
        for (int i = 0; i < numeroFuncionarios; i++) {
            System.out.println("Insira o nome do funcionário " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Informe o cargo do funcionário (Gerente, Desenvolvedor, Estagiario):");
            String cargo = scanner.nextLine();

            System.out.println("Insira o salário do funcionário:");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Consumir nova linha

            // Criação de funcionários com base no cargo
            Funcionario funcionario;
            switch (cargo.toLowerCase()) {
                case "gerente":
                    funcionario = new Gerente(nome, salario);
                    break;
                case "desenvolvedor":
                    funcionario = new Desenvolvedor(nome, salario);
                    break;
                case "estagiario":
                    funcionario = new Estagiario(nome, salario);
                    break;
                default:
                    System.out.println("Cargo inválido! O funcionário será adicionado como Estagiário por padrão.");
                    funcionario = new Estagiario(nome, salario);
                    break;
            }
            funcionarios.add(funcionario);
        }

        // Exibindo informações dos funcionários
        System.out.println("\n--- Informações dos Funcionários ---");
        exibirInformacoes(funcionarios);

        // Simular promoção
        System.out.println("\nDeseja promover algum funcionário? (sim/nao)");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("\nDigite a quantidade de funcionários a serem promovidos:");
            int quantidadePromocoes = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha restante

            PromocaoFuncionario promotor = new PromocaoFuncionario();

            for (int j = 0; j < quantidadePromocoes; j++) {
                System.out.println("\nDigite o nome do funcionário a ser promovido:");
                String nomeFuncionario = scanner.nextLine();
                System.out.println("Informe o novo cargo (Gerente, Desenvolvedor, Estagiario):");
                String novoCargo = scanner.nextLine();

                // Encontrar e promover o funcionário
                boolean funcionarioEncontrado = false;
                for (int i = 0; i < funcionarios.size(); i++) {
                    Funcionario f = funcionarios.get(i);
                    if (f.getNome().equalsIgnoreCase(nomeFuncionario)) {
                        funcionarios.set(i, promotor.promover(f, novoCargo));
                        funcionarioEncontrado = true;
                        System.out.println(nomeFuncionario + " promovido para " + novoCargo + " com novo salário de R$ " + funcionarios.get(i).calcularSalario());
                        break;
                    }
                }

                if (!funcionarioEncontrado) {
                    System.out.println("Funcionário " + nomeFuncionario + " não encontrado.");
                }
            }

            // Exibir lista de funcionários e seus salários após a promoção
            System.out.println("\nLista de Funcionários após promoções:");
            for (Funcionario f : funcionarios) {
                System.out.println(f.getNome() + " - Cargo: " + f.getClass().getSimpleName() + " - Salário: R$ " + f.calcularSalario());
            }
        }

        // Exibindo informações dos funcionários após a promoção
        System.out.println("\n--- Informações após a promoção ---");
        exibirInformacoes(funcionarios);
    }

    // Método para exibir informações sobre todos os funcionários
    private static void exibirInformacoes(ArrayList<Funcionario> funcionarios) {
        double totalSalario = 0;
        double totalBonus = 0;

        for (Funcionario funcionario : funcionarios) {
            double salario = funcionario.calcularSalario();
            double bonus = funcionario.calcularBonus();
            totalSalario += salario;
            totalBonus += bonus;
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: R$" + salario);
            System.out.println("Bônus: R$" + bonus);
            System.out.println();
        }

        System.out.println("Total Salários: R$" + totalSalario);
        System.out.println("Total Bônus: R$" + totalBonus);
    }
}

