package DAVI_JAVA;

import java.util.Scanner;

public class Lista04_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[10][10];
        System.out.println("Digite os elementos da matriz 10x10: ");
        scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = scanner.nextInt();
                System.out.println("Elementos acima da diagonal secundária: ");
                        if (j > 9 - i) {
                            System.out.println(matriz[i][j] + "");
                            System.out.println();
                        }
                        scanner.close();
                    }
                }
            }
        }
