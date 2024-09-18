import java.util.Scanner;

public class Lista02java4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int x, y, resultado = 0;
    System.out.println("Digite o valor de X: ");
    x = sc.nextInt();
    System.out.println("Digite o valor de Y: ");
    y = sc.nextInt();
    resultado = x * y;
    System.out.println("Resultado: " + resultado);
    sc.close();
}
}
