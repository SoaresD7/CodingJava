package DAVI_JAVA;

import java.io.PrintStream;
import java.util.Locale;

public class EXFIX1 {
    public static void main(String[] args) {
    String product1 = "Computer";
    String product2 = "Office desk";

    int age = 30;
    int code = 5290;
    String gender = "F";

    double price1 = 2100.0;
    double price2 = 650.00;
    double measure = 53.234567;

    System.out.println("Products:");
    System.out.printf("%s, which price is $ %.2f%n", product1, price1);
    System.out.printf("%s, which price is $ %.2f%n", product2, price2);
    System.out.printf("Record: %d years old, code %d and %s gender: ", age, code, gender);
    System.out.printf("Measue with eight decimal places: %.8f%n", measure);
    System.out.printf("Rouded (three decimal places): %.3f%n", measure);
    Locale.setDefault(Locale.US);
    System.out.printf("US decimal point: %.3f%n", measure);

    //Concatenações de elementos
    //%f = ponto flutuante
    //%d = inteiro
    //%s = texto
    //%n = quebra de linha

    }
}
