import java.util.Scanner;
public class Lista02java19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();

        if (x % 5 == 0) {
            System.out.println("O número " + x + " é múltiplo de 5");
        } else {
            System.out.println("O número " + x + " NÃO é múltiplo de 5");
        }
    }
}

