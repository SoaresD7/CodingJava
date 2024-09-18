import java.util.Scanner;

public class Ex16Ternária {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Digite um número:");
        x = sc.nextInt();
        String resultado = ((x % 2 == 0) ? "O número é par" : "O número é ímpar");
        System.out.println(resultado);
        sc.close();
    }
}
