import java.util.Scanner;

public class VetorJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[100];
        double soma = 0;
        int igualA30 = 0;
        double media;

        // Ler os 100 números reais
        System.out.println("Digite os 100 números reais:");
        for (int i = 0; i < 100; i++) {
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }

        // Calcular a média
        media = soma / 100;

        // Contar quantos números são iguais a 30
        for (int i = 0; i < 100; i++) {
            if (numeros[i] == 30) {
                igualA30++;
            }
        }

        // Contar quantos números são maior que a média
        int maiorQueMedia = 0;
        for (int i = 0; i < 100; i++) {
            if (numeros[i] > media) {
                maiorQueMedia++;
            }
        }

        // Contar quantos números são iguais à média
        int igualAMedia = 0;
        for (int i = 0; i < 100; i++) {
            if (numeros[i] == media) {
                igualAMedia++;
            }
        }

        // Imprimir os resultados
        System.out.println("Quantos números lidos são iguais a 30: " + igualA30);
        System.out.println("Quantos números são maior que a média: " + maiorQueMedia);
        System.out.println("Quantos números são iguais à média: " + igualAMedia);
    }
}
