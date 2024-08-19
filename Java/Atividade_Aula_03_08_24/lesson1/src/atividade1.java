package Java.Atividade_Aula_03_08_24.lesson1.src;

import java.util.Scanner;

public class atividade1 {
    public atividade1() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite uma temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 9.0 / 5.0 + 32.0;
        System.out.printf("\nTemperatura em Fahrenheit: %.2f ◦F", fahrenheit);
    }
}
