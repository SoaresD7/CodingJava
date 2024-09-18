package DAVI_JAVA;

import java.util.Scanner;

public class VetorC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do seu vetor: ");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];


        System.out.println("Digite os números do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        int maior = encontrarMaior(vetor);
        System.out.println("O maior valor no vetor é: " + maior);
        scanner.close();
    }
    public static int encontrarMaior(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }
}
