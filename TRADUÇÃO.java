package DAVI_JAVA;

import java.util.Locale;

public class TRADUÇÃO {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        String gender = "F";

        double price1 = 2100.0;
        double price2 = 650.00;
        double measure = 53.234567;

        System.out.println("Produtos:");
        System.out.printf("%s, o preço é $ %.2f%n", product1, price1);
        System.out.printf("%s, o preço é $ %.2f%n", product2, price2);
        System.out.printf("Registro: %d anos de idade, código %d e %s genêro: ", age, code, gender);
        System.out.printf("Medida com oito casas decimais: %.8f%n", measure);
        System.out.printf("Encaminhado com 3 casas decimais: %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("EUA ponto decimal: %.3f%n", measure);

        //Concatenações de elementos
        //%f = ponto flutuante
        //%d = inteiro
        //%s = texto
        //%n = quebra de linha
    }
}
