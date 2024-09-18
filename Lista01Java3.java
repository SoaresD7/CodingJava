package DAVI_JAVA;

import java.util.Scanner;

public class Lista01Java3 {
    public static void main(String[] args) {
        Scanner scanner = new
                Scanner(System.in);
        System.out.println("Informe o salario do funcionario:");
        double salario =
                scanner.nextDouble();
        double novoSalario = salario * 1.25;
        System.out.println("O novo salario do funcionario é: R$ " + novoSalario);
        scanner.close();
    }
}
