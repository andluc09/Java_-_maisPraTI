package Java.Atividade_Aula_03_08_24.lesson1.src;

import java.util.Scanner;

public class atividade3 {
    public atividade3() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite um ano: ");
        int ano = scanner.nextInt();
        if ((ano % 4 != 0 || ano % 100 == 0) && ano % 400 != 0) {
            System.out.printf("\nAno não bissexto: %d", ano);
        } else {
            System.out.printf("\nAno bissexto: %d", ano);
        }

    }
}