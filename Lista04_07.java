package DAVI_JAVA;

import java.util.Scanner;

public class Lista04_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[10][10];

        // Lendo os elementos da matriz
        System.out.println("Digite os elementos da matriz 10x10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Imprimindo a matriz
        System.out.println("Matriz 10x10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Calculando a soma e a média da diagonal principal
        int somaPrincipal = 0;
        for (int i = 0; i < 10; i++) {
            somaPrincipal += matriz[i][i];
        }
        double mediaPrincipal = somaPrincipal / 10.0;
        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("Média da diagonal principal: " + mediaPrincipal);

        // Calculando a soma e a média da diagonal secundária
        int somaSecundaria = 0;
        for (int i = 0; i < 10; i++) {
            somaSecundaria += matriz[i][10 - 1 - i];
        }
        double mediaSecundaria = somaSecundaria / 10.0;
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);
        System.out.println("Média da diagonal secundária: " + mediaSecundaria);
    }
}

