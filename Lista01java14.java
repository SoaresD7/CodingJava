package DAVI_JAVA;

import java.util.Scanner;

public class Lista01java14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                Double n1, result;
        System.out.println("Digite um número: ");
        n1 = sc.nextDouble();
        result = n1 / 3;
        System.out.printf("%.2f", result);
    }
}
