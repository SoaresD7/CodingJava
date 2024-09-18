package DAVI_JAVA;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp;
        do {
            System.out.println("Digite a temperatura em celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;

            System.out.printf("O equivalente em farenheint é: " + F);
            System.out.println(" ");
            System.out.println("Deseja repetir (s/n) ? ");
            resp = sc.next().charAt(0);
        }
        while(resp!= 'n');
        sc.close();
    }

}
