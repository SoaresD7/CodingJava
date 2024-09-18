import java.util.Scanner;

public class WhileF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int positivo = sc.nextInt();
        int i = 0;
        while (i <= positivo) {
            System.out.println(i);
            i = i + 1;
        }
        sc.close();
    }
}
