package DAVI_JAVA;

import java.util.Scanner;

public class Lista04_5 {
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

        // Imprimindo os elementos da diagonal secundária
        System.out.println("Elementos da diagonal secundária:");
        for (int i = 0; i < 10; i++) {
            int j = 10 - 1 - i; // L + C = 10 + 1 => C = 10 - 1 - L
            System.out.print(matriz[i][j] + " ");
        }
    }
}

