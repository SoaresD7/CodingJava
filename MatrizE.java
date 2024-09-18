import java.util.Scanner;

public class MatrizE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linhas = 4;
        int colunas = 4;

        int [][] matriz = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };

        System.out.println("Informe o indice da coluna para soma: ");
        int coluna = scanner.nextInt();

        if (coluna < 0 || coluna >= colunas){
            System.out.println("Indice de coluna inválido");
            return;
        }
        int soma = 0;

        for (int i = 0; i < linhas; i++){
            soma += matriz[i][coluna];

        }

        System.out.println("A soma dos elementos da coluna" + coluna + "é: " + soma);
    }
}
