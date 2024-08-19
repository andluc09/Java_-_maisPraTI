package Java_maisPraTI.Atividade_Aula_03_08_24.lesson1.src;

import java.util.Scanner;

public class atividade2 {
    public atividade2() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite um número: ");
        double numero = scanner.nextDouble();
        if (numero % 2.0 == 0.0) {
            System.out.printf("\nNúmero par: %.2f", numero);
        } else {
            System.out.printf("\nNúmero ímpar: %.2f", numero);
        }

    }
}
