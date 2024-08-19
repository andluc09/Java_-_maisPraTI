package Java_maisPraTI.Atividade_Aula_03_08_24.lesson1.src;

import java.util.Scanner;

public class atividade4 {
    public atividade4() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.println("\nDigite o segundo número");
        double numero2 = scanner.nextDouble();
        System.out.println("\nDigite o operador: ");
        char operador = scanner.next().charAt(0);
        switch (operador) {
            case '*':
                System.out.printf("\nResultado %.2f * %.2f = %.2f", numero1, numero2, numero1 * numero2);
                break;
            case '+':
                System.out.printf("\nResultado %.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
                break;
            case ',':
            case '.':
            default:
                System.out.println("\nOperador inválido!");
                break;
            case '-':
                System.out.printf("\nResultado %.2f - %.2f = %.2f", numero1, numero2, numero1 - numero2);
                break;
            case '/':
                System.out.printf("\nResultado %.2f / %.2f = %.2f", numero1, numero2, numero1 / numero2);
        }

    }
}
