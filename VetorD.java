package DAVI_JAVA;

import java.util.Scanner;

public class VetorD {
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
        int menor = encontrarMenor(vetor);
        System.out.println("O menor valor no vetor é: " + menor);
        scanner.close();
    }
    public static int encontrarMenor(int[] vetor) {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }
}
