package DAVI_JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class VetorA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a quantidade de números que seram inseridos: ");
        int n = sc.nextInt();
        System.out.println("Insira os valores inteiros: ");
        int [] vetor =new int[n];
        for(int i=0; i<n; i++) {
            vetor[i] = sc.nextInt();
        }
        System.out.printf("Os números do seu vetor são :" + Arrays.toString(vetor));
        sc.close();
    }
}
