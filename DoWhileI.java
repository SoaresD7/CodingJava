package DAVI_JAVA;

import java.util.Scanner;

public class DoWhileI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        int i = 0;
        double numero;

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextDouble();

            if (numero >= 0) {
                soma += numero;
                i++;
            }
        }
        while (numero >= 0);

        sc.close();

        if (i == 0) {
            System.out.println("Nenhum número positivo foi fornecido.");
        }
        else {
            double media = soma / i;
            System.out.println("A média dos números digitados é: " + media);
        }
    }
}
