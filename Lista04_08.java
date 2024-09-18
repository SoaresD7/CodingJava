package DAVI_JAVA;

import java.util.Scanner;

public class Lista04_08 {
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

        // Calculando a soma de todos os valores da matriz
        int somaTotal = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                somaTotal += matriz[i][j];
            }
        }

        // Imprimindo a soma total dos valores da matriz
        System.out.println("Soma de todos os valores da matriz: " + somaTotal);
    }
}
    
