package DAVI_JAVA;

public class Lista04_06 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        // Preenchendo a matriz para torná-la uma matriz identidade
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        // Imprimindo a matriz identidade
        System.out.println("Matriz Identidade 10x10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
