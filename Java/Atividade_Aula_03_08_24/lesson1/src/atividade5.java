package Java.Atividade_Aula_03_08_24.lesson1.src;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String usuarioCorreto = "admin";
        final String senhaCorreta = "12345";

        int tentativas = 0;
        boolean autenticado = false;

        do {
            System.out.print("\nDigite o nome do usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("\nDigite a senha: ");
            String senha = scanner.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                autenticado = true;
                System.out.println("\nAutenticação bem-sucedida! Bem-vindo, " + usuarioCorreto + "!");
            } else {
                tentativas++;
                System.out.println("\nUsuário ou senha incorretos ( Tentativa " + tentativas + " de 3");
            }

        } while (!autenticado && tentativas < 3);

        if (!autenticado) {
            System.out.println("\nNúmero de tentativas excedido. Conta bloqueada!");
        }

        scanner.close();
    }
}
