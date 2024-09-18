public class MatrizesF {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // Calculando a soma dos elementos da quarta coluna
        int somaQuartaColuna = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaQuartaColuna += matriz[i][3]; // A quarta coluna tem índice 3
        }

        // Exibindo a matriz
        System.out.println("Matriz 4x4:");
        imprimirMatriz(matriz);

        // Exibindo a soma dos elementos da quarta coluna
        System.out.println("\nSoma da quarta coluna: " + somaQuartaColuna);
    }

    // Método para imprimir a matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

