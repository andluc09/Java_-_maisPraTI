package Java.Atividade_Aula_31_07_24.lesson1.src;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.GERMANY);

        byte byteVar = 127;
        short shortVar = 32000;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;

        float floatVar = 3.14F;
        double doubleVar = 3.14159265;

        char charVar = 'A';

        boolean booleanVar = true;

        String stringVar = "Text";

        System.out.println("\nByte: " + byteVar);
        System.out.println("\nShort: " + shortVar);
        System.out.println("\nInt: " + intVar);
        System.out.println("\nLong: " + longVar);
        System.out.println("\nFloat: " + floatVar);
        System.out.println("\nDouble: " + doubleVar);
        System.out.println("\nChar: " + charVar);
        System.out.println("\nBoolean: " + booleanVar);
        System.out.println("\nString: " + stringVar);

        floatVar = 5.896F;

        System.out.printf("\nFloat delimitado as casas decimais: %.2f\n", floatVar);

        int a, b, c;
        double area;

        a = 5;
        b = 7;
        c = 3;

        area = (double) (a+b)/2 * c; // Casting = atribuir um tipo double a uma expressão que utiliza números inteiros

        System.out.println("\nArea: " + area);

        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme seu nome: ");

        String name = sc.next();

        System.out.println("\nSeu nome é: " + name);

        System.out.print("\nInforme sua idade: ");

        int idade = sc.nextInt();

        System.out.printf("\nVocê tem: %d anos\n", idade);

        System.out.print("\nDigite uma palavra: ");

        char character = sc.next().charAt(0);

        System.out.printf("\nVocê digitou uma palavra que começa com a letra: %c", character);
    }
}
