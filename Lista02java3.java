import java.util.Scanner;

public class Lista02java3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int antecessor = 0;
        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        antecessor = numero - 1;
        System.out.println("O antecessor do seu número é: " + antecessor);
        sc.close();
    }
}
