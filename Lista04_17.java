import java.util.Scanner;

public class Lista04_17 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Definindo e preenchendo a matriz original 3x3
            int[][] matrizOriginal = new int[3][3];

            System.out.println("Entre com os valores para a matriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.printf("Matriz[%d][%d]: ", i, j);
                    matrizOriginal[i][j] = scanner.nextInt();
                }
            }

            
            int[][] matrizGirada = new int[3][3];


            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrizGirada[j][2 - i] = matrizOriginal[i][j];
                }
            }


            System.out.println("Matriz original:");
            imprimirMatriz(matrizOriginal);


            System.out.println("Matriz girada 90 graus no sentido horário:");
            imprimirMatriz(matrizGirada);

            scanner.close();
        }


        public static void imprimirMatriz(int[][] matriz) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


