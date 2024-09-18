import java.util.Scanner;
    public class ForH {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Insira um número inteiro positivo: ");
            int numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("O número inserido não é positivo.");
                return;
            }
            System.out.println("Divisores de " + numero + ":");
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.println(i);
                }
            }
            scanner.close();
        }
    }

