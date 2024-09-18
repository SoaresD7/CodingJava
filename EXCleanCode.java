package DAVI_JAVA;

import java.util.Scanner;

public class EXCleanCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int primeiroNumero = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int segundo_Numero = scanner.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int terceiroNumero = scanner.nextInt();

        System.out.println((terceiroNumero >= primeiroNumero && terceiroNumero <= segundo_Numero) ? "O terceiro número pertence ao intervalo [" + primeiroNumero + ", " + segundo_Numero + "]" : "O terceiro número não pertence ao intervalo [" + primeiroNumero + ", " + segundo_Numero + "]");

        scanner.close();
    }
}
