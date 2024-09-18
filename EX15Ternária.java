package DAVI_JAVA;

import java.util.Scanner;
public class Lista02java15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, resultado;
        System.out.println("Digite o valor de x:");
        x = sc.nextInt();
        System.out.print("Digite o valor de y:");
        y = sc.nextInt();
        resultado = (x > y) ? x : y;
        sc.close();
        System.out.println("O maior valor é: " + resultado);
    }
}
