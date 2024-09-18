package DAVI_JAVA;

import java.util.Scanner;

public class Lista04_21 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int linhasA = 3;
            int colunasA = 4;
            int linhasB = 4;
            int colunasB = 5;

            if (colunasA != linhasB) {
                System.out.println("O número de colunas da matriz A deve ser igual ao número de linhas da matriz B.");
                return;
            }

            int[][] matrizA = new int[linhasA][colunasA];
            int[][] matrizB = new int[linhasB][colunasB];
            int[][] matrizProduto = new int[linhasA][colunasB];

            System.out.println("Digite os valores da matriz A (3x4):");
            for (int i = 0; i < linhasA; i++) {
                for (int j = 0; j < colunasA; j++) {
                    matrizA[i][j] = sc.nextInt();
                }
            }

            System.out.println("Digite os valores da matriz B (4x5):");
            for (int i = 0; i < linhasB; i++) {
                for (int j = 0; j < colunasB; j++) {
                    matrizB[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < linhasA; i++) {
                for (int j = 0; j < colunasB; j++) {
                    matrizProduto[i][j] = 0;
                    for (int k = 0; k < colunasA; k++) {
                        matrizProduto[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }

            System.out.println("Matriz Produto (3x5):");
            for (int i = 0; i < linhasA; i++) {
                for (int j = 0; j < colunasB; j++) {
                    System.out.print(matrizProduto[i][j] + " ");
                }
                System.out.println();
            }

            sc.close();
        }
    }