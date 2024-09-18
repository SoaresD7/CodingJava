import java.util.Scanner;

public class Lista04_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[10][10];

        System.out.println("Digite os números da matriz 10x10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        sc.close();

        System.out.println("Os números da diagonal principal são:");
        for (int i = 0; i < 10; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }
}
