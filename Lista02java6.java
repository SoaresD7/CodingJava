import java.util.Scanner;

public class Lista02java6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Le o primeiro número
        System.out.print("Digite o primeiro número (X): ");
        int x = scanner.nextInt();

        // Le o segundo número
        System.out.print("Digite o segundo número (Y): ");
        int y = scanner.nextInt();

        // Calcula o resto da divisão de X por Y
        int resto = x % y;

        // Mostra o resto da divisão
        System.out.printf("O resto da divisão de %d por %d é: %d\n", x, y, resto);
        scanner.close();
    }
}
