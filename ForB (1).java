package DAVI_JAVA;

import java.util.Scanner;

public class ForB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir um número inteiro positivo
        System.out.print("Insira um número inteiro positivo: ");
        int numero = scanner.nextInt();
        System.out.println("Números pares entre 0 e " + numero + ":");
        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
