package DAVI_JAVA;

import java.util.Scanner;

public class ForF {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número inteiro positivo: ");
            int numero = scanner.nextInt();
            scanner.close();
            boolean Primo = true;
            if (numero <= 1) {
                Primo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        Primo = false;
                        break;
                    }
                }
            }
            if (Primo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        }
    }