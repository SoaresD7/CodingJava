public class Lista04I {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = i + j;
            }
        }
        int soma = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.println(" A soma dos elementos abaixo da diagonal principal é: " + soma);
    }
}
