import javax.swing.*;
import java.util.Scanner;

public class Lista02java18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z = 0;
        System.out.println("Digite o valor de x: ");
        x = sc.nextInt();
        System.out.println("Digite o valor de y: ");
        y = sc.nextInt();
        System.out.println("Digite o valor de z: ");
        z = sc.nextInt();
        if (x > y && x > z) {
            System.out.println("O valor " + z + "pertence ao intervalo");
              if (x < y && x < z); {
                System.out.println("O valor " + z + "não pertence ao intervalo");
            }
        }
    }
}
