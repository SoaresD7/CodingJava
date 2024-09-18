import java.util.Scanner;

public class Lista04_15 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[][] C = new int[2][3];



            System.out.println("Entre com os valores para a matriz C (2x3):");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.printf("C[%d][%d]: ", i, j);
                    C[i][j] = scanner.nextInt();
                }
            }

            int[][] Ct = new int[3][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    Ct[j][i] = C[i][j];
                }
            }
            System.out.println("Matriz transposta Ct (3x2):");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(Ct[i][j] + " ");
                }
                System.out.println();
            }

            scanner.close();
        }
}
