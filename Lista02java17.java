import java.util.Scanner;

public class Lista02java17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char sexo;
        System.out.print("Digite seu sexo (M - para masculino / F - para feminino): ");
        sexo = scanner.next().charAt(0);

        if (sexo == 'M' || sexo == 'm') {
            System.out.println("Seja bem-vindo, Senhor!");
        } else if (sexo == 'F' || sexo == 'f') {
            System.out.println("Seja bem-vinda, Senhora!");
        } else {
            System.out.println("Opção inválida. Digite M ou F.");
        }
    }
}