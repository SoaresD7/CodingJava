import java.util.Scanner;

public class Lista02java2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int sucessor = 0;
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
        sucessor = numero + 1;
        System.out.println("O sucessor do seu número é: " + sucessor);
        sc.close();
    }
}
