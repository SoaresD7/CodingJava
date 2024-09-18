package DAVI_JAVA;

import java.util.Scanner;

public class WhileA {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo:");
        int numero = sc.nextInt();
        int par = 0;
        while (par <= numero) {
            if (par % 2 == 0) {
                System.out.println(par);
            }
            par = par + 1;
        }

        sc.close();
    }
}
