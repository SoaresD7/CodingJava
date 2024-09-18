public class MatrizesG {
    public static void main(String[] args){
        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int somaAcimaDiagonal = 0;
        int tamanhoMatriz = matriz.length;

        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = i + 1; j < tamanhoMatriz; j++) {
                somaAcimaDiagonal += matriz[i][j];
            }
        }
        System.out.println("Matriz:");
        imprimirMatriz(matriz);
        System.out.println("\nSoma dos elementos acima da diagonal principal: " + somaAcimaDiagonal);
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

