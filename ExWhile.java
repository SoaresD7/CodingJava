package DAVI_JAVA;

import java.util.Scanner;

public class ExWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int entrada = sc.nextInt();

        while (entrada != 9){
            System.out.println("Digite outro número: ");
            entrada = sc.nextInt();
        }
        sc.close();
    }
}
