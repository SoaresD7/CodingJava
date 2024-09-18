package DAVI_JAVA;

import java.util.Scanner;

public class DoWhileH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "1234";
        String senhaDigitada;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = sc.nextLine();

            if (senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha correta! Acesso permitido.");
                break;
            }

            else {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }
        while (true);

        sc.close();
   }
}