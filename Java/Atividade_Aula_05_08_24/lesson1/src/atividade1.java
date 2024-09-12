package Java.Atividade_Aula_05_08_24.lesson1.src;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {

        int[] vetor = new int[5];

        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;

        System.out.println("Elementos do array 'vetor': ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor[" + i + "]: " + vetor[i]);
        }

        System.out.print("\nSoma dos elementos do array 'vetor': ");
        int sum = 0;
        for (int i = 0; i < vetor.length; i++) {
            sum += vetor[i];
        }

        System.out.println(sum);

        System.out.print("\nMaior elemento do array 'vetor': ");
        int max = 0;
        /*for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] >= max) {
                max = vetor[i];
            }
        }*/

        for(int value : vetor) {
            if(value >= max) {
                max = value;
            }
        }

        System.out.println(max);

        int[] vetorInicializado = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("\nVetor inicializado:" + vetorInicializado[0] + "\n");

        for (int i = 0; i < vetorInicializado.length; i++) {
            System.out.println("Vetor[" + i + "]: " + vetorInicializado[i]);
        }

        // Reverter o array

        int start = 0;
        int end = vetor.length - 1;

        while (start < end) {
            int temp = vetor[start];
            vetor[start] = vetor[end];
            vetor[end] = temp;

            start++;
            end--;
        }

        System.out.println("\nArray 'vetor' invertido: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor na posição [" + i + "]: " + vetor[i]);
        }

        // Adicionando elementos no Array

        int[] newVetor = new int[vetor.length + 1];

        for (int i = 0; i < vetor.length; i++) {
            newVetor[i] = vetor[i];
        }

        newVetor[vetor.length] = 100;

        vetor = newVetor; // Atualize a referência para o novo array

        System.out.println("\nArray 'vetor' com novo elemento: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor na posição [" + i + "]: " + vetor[i]);
        }

        // Removendo elementos do Array

        /*vetor[vetor.length - 1] = 0;

        System.out.println("\nArray 'vetor' sem o último elemento: ");
        for (int i = 0; i < vetor.length - 1; i++) {
            System.out.println("Vetor na posição [" + i + "]: " + vetor[i]);
        }*/

        int count = 0;

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] != 100) {
                count++;
            }
        }

        int[] novoArray = new int[count];
        int index = 0;

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]!= 100) {
                novoArray[index] = vetor[i];
                index++;
            }
        }

        vetor = novoArray; // Atualize a referência para o novo array

        System.out.println("\nArray 'vetor' sem o último elemento: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor na posição [" + i + "]: " + vetor[i]);
        }

        // Pesquisar um elemento do Array
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInsira um elemento para ser pesquisado no Array:");
        int searchValue = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == searchValue) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("\nElemento " + searchValue + " encontrado no array.\n");
        } else {
            System.out.println("\nElemento " + searchValue + " não encontrado no array.\n");
        }

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Matriz[" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }

        // Opção com Programação Funcional: estrutura de repetição

        System.out.println("\nPercorrendo e imprimindo a matriz: \n");
        for(int[] row : matriz) {
            for(int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Soma - Matriz

        int soma = 0;

        for(int[] row : matriz) {
            for(int value : row) {
                soma += value;
            }
        }
        System.out.println("\n Soma de todos os elementos da matriz: " + soma);

        // Diagonal Principal da Matriz

        System.out.println("Diagonal Principal da Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(i == j) {
                    System.out.println(matriz[i][j] + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Diagonal Secundária da Matriz

        System.out.println("Diagonal Secundária da Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(i + j == matriz.length - 1) {
                    System.out.println(matriz[i][j] + " ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        // Rotacionando a Matriz em 90º

        int n = matriz.length;
        int[][] matrizRotacionada = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizRotacionada[j][n - 1 - i] = matriz[i][j];
            }
        }

        System.out.println("\nMatriz rotacionada em 90º: \n");
        for(int[] row : matrizRotacionada) {
            for(int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Soma Diagonal Principal e Secundária da Matriz

        int sumPrincipal = 0;

        int sumSecundaria = 0;

        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(i == j) {
                    sumPrincipal += matriz[i][j];
                }
                if((i + j) == matriz.length - 1) {
                    sumSecundaria += matriz[i][j];
                }
            }
        }

        System.out.println("\nSoma Diagonal Principal: " + sumPrincipal);
        System.out.println("\nSoma Diagonal Secundária: " + sumSecundaria);

        // Pesquisa de ocorrências de um elemento da Matriz

        System.out.println("\nInsira um número para encontrar na Matriz: ");
        int pesquisaValorMatriz = scanner.nextInt();
        int ocorrencias = 0;

        for (int[] row : matriz) {
            for(int value : row) {
                if(value == pesquisaValorMatriz) {
                    ocorrencias++;
                }
            }
        }

        if(ocorrencias == 1) {
            System.out.println("\nO elemento " + pesquisaValorMatriz + " aparece " + ocorrencias + " vez na matriz.");
        } else if(ocorrencias > 1) {
            System.out.println("\nO elemento " + pesquisaValorMatriz + " aparece " + ocorrencias + " vezes na matriz.");
        } else {
            System.out.println("\nO elemento " + pesquisaValorMatriz + " não foi encontrado na matriz.");
        }

        System.out.println("\nInsira outro número para encontrar na Matriz: ");
        int pesquisaValorMatriz1 = scanner.nextInt();
        boolean encontrado = false;
        int ocorrencias1 = 0;

        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == pesquisaValorMatriz1) {
                    ocorrencias1++;
                    encontrado = true;
                    System.out.println("Valor " + pesquisaValorMatriz1 + " encontrado na linha: " + i + ", coluna: " + j + "\n");
                }
            }
        }
        if(!encontrado) {
            System.out.println("Valor " + pesquisaValorMatriz1 + " não encontrado!");
        }

        if(ocorrencias1 == 1) {
            System.out.println("\nO elemento " + pesquisaValorMatriz1 + " aparece " + ocorrencias1 + " vez na matriz.");
        } else if(ocorrencias1 > 1) {
            System.out.println("\nO elemento " + pesquisaValorMatriz1 + " aparece " + ocorrencias1 + " vezes na matriz.");
        } else {
            System.out.println("\nO elemento " + pesquisaValorMatriz1 + " não foi encontrado na matriz.");
        }
    }
}
