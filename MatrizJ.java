public class MatrizJ {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.println("A soma dos números abaixo da diagonal principal é: " + soma);
}
}
