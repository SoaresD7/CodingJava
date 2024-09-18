package DAVI_JAVA;

import java.util.Scanner;

public class VetorB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de números que seram inseridos");
        int n = sc.nextInt();
        System.out.println("Insira os números reais:");
        double [] vetor =new double[n];

        for(int i=0; i<n; i++){
            vetor[i] = sc.nextDouble();
        }
        double num = 0.0;
        for (int i=0; i<n; i++){
            num += vetor[i];
        }
        double media = num / n;
        System.out.printf("A média dos números é :" + media);
        sc.close();
    }
}
