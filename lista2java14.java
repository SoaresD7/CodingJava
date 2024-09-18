import java.util.Scanner;

public class lista2java14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();
        System.out.print("Digite o valor de y: ");
        int y = scanner.nextInt();
        if (x == y) {
            System.out.println("Os valores de x e y são iguais.");
        } else
            System.out.println("Os valores de x e y são diferentes.");
            scanner.close();}
    }
