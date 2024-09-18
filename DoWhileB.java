import java.util.Scanner;

public class DoWhileB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int numero = sc.nextInt();

        int i = 1;

        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }
        while (i <= 10);

        sc.close();
    }
}
