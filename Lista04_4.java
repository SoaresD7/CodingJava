import java.util.Scanner;

public class Lista04_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando uma matriz 10x10
        int[][] matriz = new int[10][10];

        System.out.println("Digite os números da matriz 10x10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        sc.close();

        System.out.println("Os números abaixo da diagonal principal:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i > j) {
                    System.out.print(matriz[i][j] + " ");
                } else {

                    System.out.print("  ");
                }
            }

            System.out.println();}

    }
}
