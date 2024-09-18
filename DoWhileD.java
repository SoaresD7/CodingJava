package DAVI_JAVA;

import java.util.Scanner;

public class DoWhileD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "senha123";
        int tentativas = 3;

        do {
            System.out.print("Digite a senha: ");
            String senhaDigitada = sc.nextLine();

            if (senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha correta! Acesso permitido.");
                break;
            }
            else {
                tentativas--;
                System.out.println("Senha incorreta. Tentativas restantes: " + tentativas);
            }
        }
        while (tentativas > 0);

        if (tentativas == 0) {
            System.out.println("Você excedeu o número de tentativas permitidas. Acesso negado.");
        }

        sc.close();
    }
}
