import java.util.Scanner;

public class Lista02java18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();
        System.out.print("Digite o valor de y: ");
        int y = scanner.nextInt();
        System.out.print("Digite o valor de z: ");
        int z = scanner.nextInt();

        System.out.println((z >= x && z <= y) ? "z pertence ao intervalo [" + x + ", " + y + "]" : "z não pertence ao intervalo [" + x + ", " + y + "]");

        scanner.close();


    }
}
