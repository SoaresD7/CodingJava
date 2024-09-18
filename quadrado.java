package DAVI_JAVA;

import java.util.Scanner;

public class quadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  b, h, area;
        System.out.println("Digite os números");
        b = sc.nextDouble();
        h = sc.nextDouble();
        sc.close();
        area = b * h;
        System.out.println("A sua base é:" + b);
        System.out.println("A sua altura é:" + h);
        System.out.println("A sua área é:" + area);
    }
}
