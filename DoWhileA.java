import java.util.Scanner;

public class DoWhileA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número inteiro positivo: ");
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("O número inserido não é positivo. ");
            return;
        }

        int i = 0;

        System.out.println("Números pares entre 0 e " + numero + ":");
        do {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        while (i <= numero);

        sc.close();
    }
}
