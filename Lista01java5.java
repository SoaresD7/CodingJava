package DAVI_JAVA;

import java.util.Scanner;

public class Lista01java5 {
    public static void main(String[] args) {
        Scanner scanner = new
                Scanner(System.in);
        System.out.println("Informe seu nome de usuario");
        String nome = scanner.nextLine();
        System.out.println("Informe sua idade");
        int idade = scanner.nextInt();
        System.out.println("Nome:" + nome);
        System.out.println("Idade:" + idade);
        scanner.close();
    }
}
